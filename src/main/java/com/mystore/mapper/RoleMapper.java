package com.mystore.mapper;

import com.mystore.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by FireCode on 2020/2/6.
 */
@Repository
public interface RoleMapper {
    public List<Role> getRoleAll();
}
