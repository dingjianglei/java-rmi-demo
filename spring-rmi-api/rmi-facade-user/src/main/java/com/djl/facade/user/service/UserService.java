package com.djl.facade.user.service;

import com.djl.facade.user.model.User;
/**
 * 定义用户服务接口
 * @author dingjianglei
 *
 */
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
