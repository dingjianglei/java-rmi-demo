package com.djl.facade.user.ws.service;

import javax.jws.WebService;

import com.djl.facade.user.model.User;

@WebService
public interface UserService {
	/**
	 * 注册用户信息
	 * @param user
	 * @return
	 */
	User register(User user);
	
	/**
	 * 用户登录
	 * @param loginName
	 * @param pwd
	 * @return
	 */
	User login(String loginName,String pwd);
}
