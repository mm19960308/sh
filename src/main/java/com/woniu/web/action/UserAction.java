package com.woniu.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniu.domain.User;
import com.woniu.service.IUserService;
import com.woniu.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	private IUserService  is = new UserServiceImpl();

	public String save() {
		is.save(user);
		return "find";
	}
	
	public String find() {
		System.out.println("---------");
		List<User> list = is.find();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", list);
		return "findUI";
	}
	
	
	public String delete() {
		Integer id = user.getId();
		is.delete(id);
		return "find";
	}
	
	public String updateUI() {
		Integer id = user.getId();
		user = is.find(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("user", user);
		return "updateUI";
	}
	
	public String update() {
		is.update(user);
		
		
		return "find";
	}
	
	@Override
	public User getModel() {
		return user;
	}

}
