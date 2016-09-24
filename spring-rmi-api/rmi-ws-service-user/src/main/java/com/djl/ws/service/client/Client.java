package com.djl.ws.service.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.djl.facade.user.model.User;
import com.djl.facade.user.ws.service.UserService;

public class Client {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(UserService.class);
		factory.setAddress("http://localhost:9527/userService");
		UserService uservice = (UserService)factory.create();
		User user = uservice.login("djl", "djl");
		System.out.println("user.name="+user.getName());
	}
}
