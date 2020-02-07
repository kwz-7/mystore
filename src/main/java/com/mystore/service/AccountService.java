package com.mystore.service;

import com.mystore.entity.Account;
import com.mystore.entity.User;

import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
public interface AccountService {
    public List<Account> getByUid(Integer uId);
    public List<Account> getAllAccounts();
}
