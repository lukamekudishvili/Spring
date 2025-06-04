package com.luka.aopdemo.DAO;

import com.luka.aopdemo.model.Account;

public interface AccountDAO {

    void addAccount(Account account, boolean vipFlag);
    boolean addPost();

    public String getName();

    public void setName(String name);

    public String getPassword();

    public void setPassword(String password);
}
