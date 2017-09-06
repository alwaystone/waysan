package com.ways.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ways.user.dao.UserDao;
import com.ways.user.entity.User;
import com.ways.user.service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao userDao ;
	
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public List<User> getUserList(Map param) {
		return userDao.getUserList(param);
	}

	public User getUserById(String id) {
		return userDao.getUserById(id);
	}

}