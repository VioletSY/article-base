package com.googosoft.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
	
	@RequestMapping("login")
	public String login(){
		
		return "";
	}
	

}
