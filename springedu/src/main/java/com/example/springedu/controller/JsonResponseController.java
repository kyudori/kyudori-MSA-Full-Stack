package com.example.springedu.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springedu.domain.TestVO;
@RestController
public class JsonResponseController {
	@RequestMapping(value = "/getJSON1", produces = "application/json; charset=utf-8")
	public String test1(String id) {
		String s = "{ \"name\":\"둘리\",\"id\":\"" + id +"\"}";
		return s;
	}

	@RequestMapping(value = "/getJSON2", produces = "application/json; charset=utf-8")
	public HashMap<String, String> test2(String id) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "유니코");
		map.put("id", id);
		return map;
	}
	
	@RequestMapping(value = "/getJSON3", produces = "application/json; charset=utf-8")
	public TestVO test3(String id) {
		TestVO vo = new TestVO();
		vo.setName("올라프");
		vo.setId(id);
		return vo;
	}
}
