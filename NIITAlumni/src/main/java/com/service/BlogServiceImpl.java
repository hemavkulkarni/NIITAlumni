package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Model.Blog;
import com.dao.BlogDao;

@Service
public class BlogServiceImpl implements BlogService {
	public BlogServiceImpl() {
		// super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	BlogDao blogDao;

	@Transactional

	public List<Blog> getList() {

		return blogDao.getList();
	}

	@Transactional
	public void addBlog(Blog b) {
		blogDao.addBlog(b);
	}

	@Transactional
	public void approveBlog(Blog m) {
		blogDao.approveBlog(m);
	}

	@Transactional
	public void deleteBlog(int blogid) {
		blogDao.deleteBlog(blogid);
	}

	@Transactional
	public Blog getBlogbyId(int blogid) {
		return blogDao.getBlogbyId(blogid);
	}

	@Transactional
	public List<Blog> getListApprove() {

		return blogDao.getListApprove();
	}
}