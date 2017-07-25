package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao {
	//create 
 	public void save(User u);
	//read
	public  void getEmailid(String email);
	//update
	public void update(User u);
	//deleted
	public void deleteByEmailId(String email);
	//Get All
	public List<User> getAll();
	//validate
	public void validate(String email, String password);
}
