package com.example.springrestedu.controller;

import com.example.springrestedu.dto.WeatherDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

@RestController
@CrossOrigin(origins="*" )
public class WeatherController {	
	@RequestMapping(value="/weather", produces="application/json; charset=utf-8")
	public WeatherDTO xxx(){
		WeatherDTO vo = new WeatherDTO();
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory
					.newDocumentBuilder();
			Document document = documentBuilder
					.parse("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4161060000");
			String wname = document.getElementsByTagName("wfKor").item(0).getTextContent();			
			String time = document.getElementsByTagName("wfKor").item(0).getTextContent();
			vo.setTime(time);
			switch(wname) {
			case "구름많음" :
			case "흐림" :
				vo.setImg("images/cloud.png");
				break;
			case "구름조금" :
				vo.setImg("images/cloud_sun.png");
				break;
			case 	"맑음" :
				vo.setImg("images/sun.png");
				break;
			case "비" :
			case "흐리고 비" :
				vo.setImg("images/rain.png");
				break;
			case 	"눈" :
				vo.setImg("images/snow.png");
				break;
			default :
				vo.setImg("images/etc.png");			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}	
}




