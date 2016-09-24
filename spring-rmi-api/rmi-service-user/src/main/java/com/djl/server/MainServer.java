package com.djl.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
		System.out.println("===========> server start success");
	}
}
