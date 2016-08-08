package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Model.Forum;
import com.dao.ForumDao;

@Service
public class ForumServiceImpl implements ForumService {
	public ForumServiceImpl() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	ForumDao forumDao;
	@Transactional
	public void addForum(Forum u) {
		forumDao.addForum(u);
	}
	@Transactional
	public void updateForum(Forum u) {
		forumDao.updateForum(u);
	}
	@Transactional
	public void deleteForum(Forum u) {
		forumDao.deleteForum(u);
	}
	@Transactional
	public Forum getForumbyId(int Forumid) {
		return forumDao.getForumbyId(Forumid);
	}
	@Transactional
	public List<Forum> getForumList() {
		return forumDao.getForumList();
	}
}