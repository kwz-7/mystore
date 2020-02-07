package com.mystore.entity;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.rmi.server.UID;

/**
 * Created by FireCode on 2020/2/5.
 */
@Alias("account")
public class Account implements Serializable {

    private Integer id;
    private Integer uId;
    private Double money;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uId=" + uId +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
