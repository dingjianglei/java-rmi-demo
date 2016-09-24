package com.djl.rmi.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.djl.facade.user.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:spring-consumer.xml");
    	UserService userService = factory.getBean("userService",UserService.class);
    	System.out.println(userService.login("dingjianglei", "dingding"));
    }
}
