package com.springmvc.core.handlers;

import com.springmvc.core.service.MyServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
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
}
