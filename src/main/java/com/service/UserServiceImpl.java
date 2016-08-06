package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.Model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	public UserServiceImpl() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User u) {
		userDao.addUser(u);
	}

	@Override
	public void updateUser(User u) {
		userDao.updateUser(u);
	}

	@Override
	public User getUserbyId(int userid) {
		return userDao.getUserbyId(userid);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public void disableUser(User u) {
		userDao.disableUser(u);
	}

}
