package com.service;
import java.util.List;
import com.Model.User;
public interface UserService 
{
	public void addUser(User u);
	public void updateUser(User u);
	public void disableUser(int userid);
	public User getUserbyId(int userid);
	public List<User> getUserList();
}