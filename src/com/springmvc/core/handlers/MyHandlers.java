package com.springmvc.core.handlers;

import com.springmvc.bean.UserInfo;
import com.springmvc.core.service.MyServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

	@RequestMapping("/toIndex")
	public ModelAndView toIndex(){
		ModelAndView mav = new ModelAndView("index");


		return mav;
	}

	//Rest服务
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/info/{userId}",method= RequestMethod.GET)
	public @ResponseBody String info(@PathVariable String userId,HttpServletRequest request,HttpServletResponse response){

		JSONObject json = new JSONObject();
		json.put("userId", userId);

		return json.toJSONString();
	}

	@RequestMapping(value="/info2/{userId}/{username}",method=RequestMethod.GET)
	public @ResponseBody String info2(UserInfo ui,HttpServletRequest request,HttpServletResponse response){

		JSONObject json = new JSONObject();
		json.put("userId", ui.getUserId());
		json.put("name", ui.getUsername());

		return json.toJSONString();
	}
}
