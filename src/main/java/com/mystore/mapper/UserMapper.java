package com.mystore.mapper;

import com.mystore.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
@Repository
public interface UserMapper {
    public User getByUserNmae(String userName);
    public User getUserAccount(String userName);

    public List<User> getAllUser();

    public User getUserById(Integer id);

}
