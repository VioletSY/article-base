package com.googosoft.controller.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.googosoft.pojo.User;
import com.googosoft.service.user.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("test")
	public String test(String id,String name){
		return "test";
	}
	
	@RequestMapping("addUser")
	public int addUser(String id,String name){
		User user = new User();
		user.setId(id);
		user.setUserName(name);
		return service.addUser(user);
	}
	
	@RequestMapping("deleteUser")
	public int deleteUser(String id){
		return service.deleteUser(id);
	}
	
	@RequestMapping("getUserList")
	public List<User> getUserList(){
		return service.getUserList();
	}
	
	@RequestMapping("updateUser")
	public int updateUser(String id,String name){
		return service.updateUser(id,name);
	}
}
