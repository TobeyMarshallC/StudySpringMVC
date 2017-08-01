package com.springmvc.core.handlers;

import com.springmvc.core.service.MyServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("my")
public class MyHandlers {

	@Resource(name="myService")
	private MyServiceImpl myService;


	@RequestMapping("/helloworld")
	public ModelAndView hello(){
		Map resultMap = myService.getNowData(null);
		System.out.println("hahaha");

		ModelAndView mav = new ModelAndView("success");
		mav.addObject("nowdate",resultMap.get("Now_date"));
		return  mav;
	}

	@RequestMapping("/toAddUser")
	public ModelAndView toAddUser(){
		ModelAndView mav = new ModelAndView("add_user");


		return mav;
	}

	@ResponseBody
	@RequestMapping("/saveUserInfo")
	public String saveUserInfo(){

		try {

		}catch (Exception ex){
			ex.printStackTrace();
		}

		return "done";
	}
}
