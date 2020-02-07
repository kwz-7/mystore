package com.mystore.mapper;

import com.mystore.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
@Repository
public interface AccountMapper {
    public List<Account> getByUid(Integer uId);
    public List<Account> getByUserId(Integer uId);

    public List<Account> getAllAccounts();

}
