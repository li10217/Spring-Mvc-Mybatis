package com.game.yxd.service;

import java.util.List;

import com.game.yxd.dto.User;


public interface  IUserService {
	
	public User getUserById(int userId);  
	  
    public void insertUser(User user);  
  
    public void addUser(User user);  
  
    public List<User> getAllUser();  
}
