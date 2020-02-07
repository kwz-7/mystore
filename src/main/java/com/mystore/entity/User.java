package com.mystore.entity;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by FireCode on 2020/2/5.
 */
@Alias("user")
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String sex;
    private List<Account> accounts;









    private List<Role> roles;



    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", accounts=" + accounts +
                ", roles=" + roles +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
