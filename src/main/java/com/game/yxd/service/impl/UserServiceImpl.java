package com.game.yxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.yxd.dao.IUserDao;
import com.game.yxd.dto.User;
import com.game.yxd.service.IUserService;

@Service("userService") 
public class UserServiceImpl  implements IUserService{

	@Autowired(required=false)
    private IUserDao userDao;  
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	public void insertUser(User user) {
		userDao.insert(user);
	}

	public void addUser(User user) {
		userDao.insertSelective(user);
	}

	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
	
}
