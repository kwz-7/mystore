package com.mystore.service.impl;

import com.mystore.entity.Account;
import com.mystore.mapper.AccountMapper;
import com.mystore.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public List<Account> getByUid(Integer  uid){
        return accountMapper.getByUid(uid);
    }
    public List<Account> getAllAccounts(){
        return accountMapper.getAllAccounts();
    }
}
