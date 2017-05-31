package com.springmvc.core.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHandlers {

	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("hahaha");
		return "success";
	}
}
