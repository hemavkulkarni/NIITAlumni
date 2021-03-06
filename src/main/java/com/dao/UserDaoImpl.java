package com.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Model.User;
import com.model.UserRole;
import com.model.Users;
@Repository
public class UserDaoImpl implements UserDao 
{
	public UserDaoImpl() 
	{
		//super();
	}
	@Autowired
	 SessionFactory sessionFactory;
	@Transactional
	public void updateUser(User u)
	{		

	}

	@Override
	public void disableUser(int userid)
	{		
		

	}

	@Transactional
	public User getUserbyId(int userid) {
		Session session = sessionFactory.openSession();  
		 User u= (User) session.load(User.class, userid);  
		  return u;
	}
@Transactional
	public List<User> getUserList()
	{
		Session session = sessionFactory.openSession();  
		  @SuppressWarnings("unchecked")  
		  List<User> UserList = session.createQuery("from User").list();  
		  session.close();  
		  return UserList;
	}

	@Override
	public void addUser(User u) 
	{
		System.out.println(u.getUsername());
		 Session session=sessionFactory.openSession();
		 
         session.saveOrUpdate(u);
         User newUser = new User();
         newUser.setUsername(u.getUsername());
         newUser.setPassword(u.getPassword());
         newUser.setFullname(u.getFullname());
         newUser.setEnabled(true);
         
         newUser.setPhoneno(u.getPhoneno());
         newUser.setGender(u.getGender());
         newUser.setCity(u.getCity());
         
         newUser.setUserrole("ROLE_ADMIN");
         session.saveOrUpdate(newUser);
         
         /*newUser.setUserrole("ROLE_USER");
         session.saveOrUpdate(newUser);
         */
         System.out.println(u.getUsername());
	     session.flush();
         session.close();		
	}
}