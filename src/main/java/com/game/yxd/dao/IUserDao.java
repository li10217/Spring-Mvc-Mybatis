package com.game.yxd.dao;

import java.util.List;

import com.game.yxd.dto.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    public List<User> getAllUser();  
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}