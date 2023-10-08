package com.wanted.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("main");
		return mav;
	}
	
}
