package com.mystore.service.impl;

import com.mystore.entity.User;
import com.mystore.mapper.UserMapper;
import com.mystore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUserNmae(String userName){
       return userMapper.getByUserNmae(userName);
    }
    @Override
    public User getUserAccount(String userName){
        return  userMapper.getUserAccount(userName);
    }
    @Override
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
}
