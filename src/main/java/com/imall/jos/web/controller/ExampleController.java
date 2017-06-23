package com.imall.jos.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.imall.jos.bean.entity.ExampleEntity;
import com.imall.jos.service.IExampleService;

/** 
 * @Project     jos 
 * @File        ExampleController.java 
 * @Package     com.imall.jos.controller 
 * @Version     V1.0 
 * @Date        2017年6月22日 下午3:07:28 
 * @Author      leo
 */
@RestController
public class ExampleController {

	@Autowired
	private IExampleService iExampleService;
	
	@RequestMapping("/")
	String home(){
		return "hello world spring boot!";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public int addExample(){
		ExampleEntity exampleEntity = new ExampleEntity();
		exampleEntity.setAaa("555");
		exampleEntity.setBbb("666");
		if(iExampleService.insertExample(exampleEntity)){
			return 200;
		}
		return 500;
	}
	
	@RequestMapping("/hi")
	public ModelAndView welcome(){
		ModelAndView mv = new ModelAndView("welcome");
		mv.getModel().put("toUserName", "李磊");
		mv.getModel().put("message", "你好啊！");
		mv.getModel().put("fromUserName", "韩梅梅");
		mv.getModel().put("time", "2017-06-23");
		ModelMap mv2 = new ModelMap();
		mv2.addAttribute("toUserName", "李磊");
		mv2.addAttribute("message", "你好啊！");
		mv2.addAttribute("fromUserName", "韩梅梅");
		mv2.addAttribute("time", "2017-06-23");
		return mv;
	}
}
