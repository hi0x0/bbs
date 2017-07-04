package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.model.User;
import com.model.UserExample;

@Service("userService")
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public User getUser(int userId){
		
		return userMapper.selectByPrimaryKey(userId);
	}
	public List<User> getAllUser(UserExample ue){
		
		return userMapper.selectByExample(ue);
	}
	public void addUser(User u){
		userMapper.insert(u);
	}
}
