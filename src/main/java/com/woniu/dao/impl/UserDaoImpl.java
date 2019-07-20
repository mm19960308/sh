package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.woniu.dao.IUserDao;
import com.woniu.domain.User;
import com.woniu.util.HibernateUtils;

public class UserDaoImpl implements IUserDao {

	@Override
	public void save(User user) {
		Session s = HibernateUtils.openSession();
		s.save(user);
		
	}

	@Override
	public void delete(Integer id) {
		Session s = HibernateUtils.openSession();
		User user = s.get(User.class, id);
		s.delete(user);
	}

	@Override
	public void update(User user) {
		Session s = HibernateUtils.openSession();
		s.update(user);

	}

	@Override
	public List<User> find() {
		Session s = HibernateUtils.openSession();
		String hql = "FROM User";
		Query q = s.createQuery(hql);
		List list = q.list();
		return list;
	}

	@Override
	public User find(Integer id) {
		Session s = HibernateUtils.openSession();
		String hql = "FROM User WHERE id = ?1";
		Query q = s.createQuery(hql);
		q.setParameter(1, id);
		User user = (User) q.uniqueResult();
		return user;
	}

}
