package com.woniu.dao;

import java.util.List;

import com.woniu.domain.User;

public interface IUserDao {
	void save(User user);
	void delete(Integer id);
	void update(User user);
	List<User> find();
	User find(Integer id);
}
