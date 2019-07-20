package com.woniu.web.interceptor;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.woniu.util.HibernateUtils;

public class A implements Interceptor {

	public void destroy() {
	}
	public void init() {
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		try {
			invocation.invoke();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		
		return null;
	}

}
