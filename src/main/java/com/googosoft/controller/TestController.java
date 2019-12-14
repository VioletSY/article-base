package com.googosoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("hello")
	public String helloWorld(){
		return "helloworld";
	}
}
