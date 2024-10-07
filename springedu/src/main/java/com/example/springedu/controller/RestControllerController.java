package com.example.springedu.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springedu.domain.MyModel;
@RestController
public class RestControllerController {
	@RequestMapping(value = "/rest/text/{id}", produces="text/plain; charset=utf-8")	
	public String getByIdInTEXT(@PathVariable String id) {
		return "<h1>컨트롤러에서 바로 문자열을 리턴해요 : "+id+"</h1>";
	}

	@RequestMapping(value = "/rest/htmltext/{id}", produces="text/html; charset=utf-8")	
	public String getByIdInHTMLTEXT(@PathVariable String id) {
		return "<h1>컨트롤러에서 바로 HTML 문자열을 리턴해요 : " + id +"</h1>";
	}

	@RequestMapping(value = "/rest/json/{id}", produces = "application/json; charset=utf-8")
	public MyModel getByIdInJSON(@PathVariable String id) {
		MyModel my = new MyModel();
		my.setFlowerName("장미");
		my.setNum(5);
		my.setId(id);
		return my;
	}
}











