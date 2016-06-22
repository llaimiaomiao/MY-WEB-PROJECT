package cn.jbit.Buy.dao;

import java.util.List;

import cn.jbit.Buy.entity.User;


public interface UserDao {
	//检查登陆功能
	User checkLogin(User user);
	//检查用户名是否存在
	boolean findUserIsExist(String name);
	//注册功能
	boolean addUser(User user);
	//查找除了当前登陆用户以外的其他用户
	List<User> findOtherUsers(String name);
}
