package com.example.springrestedu.controller;

import java.nio.charset.Charset;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import com.example.springrestedu.dto.MemberDTO;

@RestController
@RequestMapping("/restapi")
@Slf4j
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        log.info("getHello 메소드가 호출되었습니다.");
        return "안녕하세요?";
    }
    @GetMapping(value = "/name")
    public String getName() {
        log.info("getName 메소드가 호출되었습니다.");
        return "<h1>둘리</h1><hr><img src='/images/dooly.png'>";
    }
    @GetMapping(value = "/var1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        log.info("@PathVariable을 통해 들어온 값 : {}", variable);
        return variable;
    }
    @GetMapping(value = "/var2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }
    @GetMapping(value = "/req1")
    public String getRequestParam1(String name, String email, String phone) {
        return name + " " + email + " " + phone;
    }
    @GetMapping(value = "/req2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " - " + map.getValue() + "<br>");
        });
        return sb.toString();
    }
    @GetMapping(value = "/req3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }
    @GetMapping(value = "/req4")
    public MemberDTO getRequestParam4(MemberDTO memberDTO) {
        return memberDTO;
    }
    @GetMapping(value = "/req5")
    public ResponseEntity getRequestParam5(String name) {
        MemberDTO dto = new MemberDTO();
        dto.setName(name);
        dto.setEmail("aaa@naver.com");
        dto.setPhone("010-3333-4444");

        HttpHeaders header = new HttpHeaders();
        header.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        return new ResponseEntity<>(dto, header, HttpStatus.OK);
    }
   @GetMapping(value = "/req6")
    public ResponseEntity<MemberDTO> getRequestParam6() {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setName("unico");
        memberDTO.setEmail("unicodaum@hanmail.net");
        memberDTO.setPhone("010-5555-6666");

        WebMvcLinkBuilder linkTo = linkTo(methodOn(GetController.class).getRequestParam6());
        return new ResponseEntity<>(memberDTO.add( linkTo.withSelfRel()), HttpStatus.OK);
    }
}
