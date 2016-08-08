package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Model.Forum;
@Repository
public class ForumDaoImpl implements ForumDao {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public void addForum(Forum f) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(f);
		Forum newForum=new Forum();
		newForum.setTopic(f.getTopic());
		newForum.setCategory(f.getCategory());
		newForum.setForumcreationdate(f.getForumcreationdate());
		session.close();
		session.flush();
	}

	@Transactional
	public void updateForum(Forum u) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(u);
		tx.commit();
		session.close();
	}

	@Transactional
	public void deleteForum(Forum u) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public Forum getForumbyId(int Forumid) {
		Session session = sessionFactory.openSession();
		Forum u = (Forum) session.load(Forum.class, Forumid);
		return u;
	}

	@Transactional
	public List<Forum> getForumList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Forum> ForumList = session.createQuery("from Forum").list();
		session.close();
		return ForumList;
	}
}