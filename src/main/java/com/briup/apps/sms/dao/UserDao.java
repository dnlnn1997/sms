package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User;

public interface UserDao {
	//查询所有
	List<User> selecteAll();
	//插入
	void insert(User user);
	//更新
	void update(User user);

}
