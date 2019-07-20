package com.woniu.service.impl;

import java.util.List;

import com.woniu.dao.IUserDao;
import com.woniu.dao.impl.UserDaoImpl;
import com.woniu.domain.User;
import com.woniu.service.IUserService;

public class UserServiceImpl implements IUserService {
	private IUserDao u = new UserDaoImpl();
	@Override
	public void save(User user) {
		u.save(user);
	}

	@Override
	public void delete(Integer id) {
		u.delete(id);
	}

	@Override
	public void update(User user) {
		u.update(user);
	}

	@Override
	public List<User> find() {
		
		return u.find();
	}

	@Override
	public User find(Integer id) {
		return u.find(id);
	}

}
