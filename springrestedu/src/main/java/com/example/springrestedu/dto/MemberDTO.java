package com.example.springrestedu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
public class MemberDTO extends RepresentationModel<MemberDTO> {
    private String name;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "MemberDTO 객체 {" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            '}';
    }
}
