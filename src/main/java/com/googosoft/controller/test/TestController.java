package com.googosoft.controller.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("index")
	public String index(Map<String,Object> params){
		return "/index.html";
	}
	
	@RequestMapping("log")
	public String log(Map<String,Object> params){
		return "/log.html";
	}
	
}
