package cn.jbit.Buy.dao;

import java.util.List;

import cn.jbit.Buy.entity.User;


public interface UserDao {
	//����½����
	User checkLogin(User user);
	//����û����Ƿ����
	boolean findUserIsExist(String name);
	//ע�Ṧ��
	boolean addUser(User user);
	//���ҳ��˵�ǰ��½�û�����������û�
	List<User> findOtherUsers(String name);
}
