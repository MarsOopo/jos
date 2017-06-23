package com.imall.jos.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
