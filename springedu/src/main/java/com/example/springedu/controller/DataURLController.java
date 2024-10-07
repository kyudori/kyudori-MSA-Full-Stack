package com.example.springedu.controller;

import com.example.springedu.domain.MyModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileReader;

@RestController
public class DataURLController {
	@RequestMapping(value = "/dataurl", produces="text/plain; charset=US-ASCII")
	public String getDataURL() {
		char[] content = null;
		File f = new File("c:/uploadtest/test.png");
		if (f.exists() && f.length() > 0) {
			content = new char[(int)f.length()];
			try (FileReader reader = new FileReader("c:/uploadtest/test.png");) {
				reader.read(content);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return new String(content);
	}
}











