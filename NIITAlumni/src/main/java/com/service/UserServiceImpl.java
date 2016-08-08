package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public void addUser(User u) {
		userDao.addUser(u);
	}
	@Transactional
	public void updateUser(User u) {
		userDao.updateUser(u);
	}
	@Transactional
	public User getUserbyId(int userid) {
		return userDao.getUserbyId(userid);
	}
	@Transactional
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	@Transactional
	public void disableUser(User u) {
		userDao.disableUser(u);
	}
}