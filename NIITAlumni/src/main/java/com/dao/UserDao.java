package com.dao;
import java.util.List;
import com.Model.User;
public interface UserDao 
{
	public void addUser(User u);
	public void updateUser(User u);
	public void disableUser(User u);
	public User getUserbyId(int userid);
	public List<User> getUserList();
}