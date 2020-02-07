package com.mystore.service;

import com.mystore.entity.User;

import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
public interface UserService {
    public User getByUserNmae(String userName);
    public User getUserAccount(String userName);
    public List<User> getAllUser();
}
