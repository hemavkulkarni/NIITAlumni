package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.Model.Blog;

public class BlogDaoImpl implements BlogDao {
	@Autowired
    SessionFactory sessionFactory;
	@Transactional
	public List<Blog> getList() 
	{
		Session session = sessionFactory.openSession();  
		  @SuppressWarnings("unchecked")  
		  List<Blog> blogList = session.createQuery("from Blog  where status='Approve'") .list();  
		  session.close();  
		  return blogList;  
	}

	@Transactional
	public void addBlog(Blog b) {
		Session session = sessionFactory.openSession();

		session.saveOrUpdate(b);
		Blog newBlog=new Blog();
		newBlog.setTitle(b.getTitle());
		newBlog.setContent(b.getContent());
		newBlog.setBlogdate(b.getBlogdate());
		newBlog.setIsvalid(true);
		newBlog.setUsername(b.getUsername());
		System.out.println(b.getTitle());
		session.flush();
		session.close();
	}

	@Transactional
	public void approveBlog(Blog blog) {
		System.out.println("Hello");
		Session session=sessionFactory.openSession();
		//System.out.println("Hello1");
		
		blog.setBlogid(blog.getBlogid());
		blog.setTitle(blog.getTitle());
		blog.setContent(blog.getContent());
		blog.setBlogdate(blog.getBlogdate());
		blog.setStatus("Approve");
		
        session.saveOrUpdate(blog);
  
	        
	        session.flush();
	        session.close();
	}

	@Transactional
	public void deleteBlog(int blogid) {
		sessionFactory.openSession().createQuery("DELETE FROM Blog WHERE blogid = "+blogid).executeUpdate();  
		
		
	}

	@Transactional
	public Blog getBlogbyId(int blogid) {
		Session session = sessionFactory.openSession();  
		  Blog blog = (Blog) session.load(Blog.class, blogid);  
		  return blog;
	}

	public List<Blog> getListApprove() {
		Session session = sessionFactory.openSession();  
		  @SuppressWarnings("unchecked")  
		  List<Blog> blogList = session.createQuery("from Blog where status='Pending'") .list();  
		  session.close();  
		  return blogList; 
	}
}