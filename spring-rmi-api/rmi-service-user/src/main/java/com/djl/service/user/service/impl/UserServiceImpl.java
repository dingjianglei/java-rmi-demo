package com.djl.service.user.service.impl;

import com.djl.facade.user.model.User;
import com.djl.facade.user.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User register(User user) {
		System.out.println("=======> operation register");
		return null;
	}

	@Override
	public User login(String loginName, String pwd) {
		System.out.println("=======> operation login");
		return null;
	}

}
