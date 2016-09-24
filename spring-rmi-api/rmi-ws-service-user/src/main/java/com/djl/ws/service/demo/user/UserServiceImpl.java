package com.djl.ws.service.demo.user;

import javax.jws.WebService;

import com.djl.facade.user.model.User;
import com.djl.facade.user.ws.service.UserService;
@WebService(serviceName="UserService",endpointInterface="com.djl.facade.user.service.UserService")
public class UserServiceImpl implements UserService{

	public User register(User user) {
		
		return user;
	}

	public User login(String loginName, String pwd) {
		return new User(loginName,pwd);
	}

}
