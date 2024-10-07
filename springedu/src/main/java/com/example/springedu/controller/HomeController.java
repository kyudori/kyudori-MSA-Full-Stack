package com.example.springedu.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/home")
	public String home(Locale locale, Model model) {
		logger.error("클라이언트의 로케일 - {}.", locale);
		logger.warn("클라이언트의 로케일 - {}.", locale);
		logger.info("클라이언트의 로케일 - {}.", locale);
		logger.debug("클라이언트의 로케일 - {}.", locale);
		logger.trace("클라이언트의 로케일 - {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
}
