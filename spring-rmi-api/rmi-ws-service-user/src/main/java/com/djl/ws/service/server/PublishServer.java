package com.djl.ws.service.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.djl.facade.user.ws.service.UserService;
import com.djl.ws.service.demo.user.UserServiceImpl;

public class PublishServer {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(UserService.class);
		factory.setAddress("http://localhost:9527/userService");
		factory.setServiceBean(userService);
		factory.create();
		System.out.println("========>pubsh success");
	}
}
