package com.googosoft.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googosoft.dao.user.UserDao;
import com.googosoft.pojo.User;

@Service
public class UserService {

	@Autowired
	private  UserDao userDao;
	
	public int addUser(User user) {
		return userDao.addUser(user);
	}
	
	public int deleteUser(String id) {
		return userDao.deleteUser(id);
	}
	
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	
	public int updateUser(String id,String name) {
		return userDao.updateUser(id,name);
	}
}
