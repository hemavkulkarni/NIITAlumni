package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public void addForum(Forum u) {
		forumDao.addForum(u);
	}

	@Override
	public void updateForum(Forum u) {
		forumDao.updateForum(u);
	}

	@Override
	public void deleteForum(Forum u) {
		forumDao.deleteForum(u);
	}

	@Override
	public Forum getForumbyId(int Forumid) {
		return forumDao.getForumbyId(Forumid);
	}

	@Override
	public List<Forum> getForumList() {
		return forumDao.getForumList();
	}
}