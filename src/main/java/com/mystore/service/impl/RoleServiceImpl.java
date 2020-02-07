package com.mystore.service.impl;

import com.mystore.entity.Role;
import com.mystore.mapper.RoleMapper;
import com.mystore.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by FireCode on 2020/2/6.
 */
@Service
public class RoleServiceImpl implements RoleService {
      @Autowired
    RoleMapper roleMapper;
    public List<Role> getRoleAll(){
       return roleMapper.getRoleAll();
    }
}
