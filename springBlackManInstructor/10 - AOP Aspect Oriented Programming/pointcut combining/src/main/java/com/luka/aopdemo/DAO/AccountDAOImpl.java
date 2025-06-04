package com.luka.aopdemo.DAO;

import com.luka.aopdemo.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private String name;
    private String password;
    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT!");
    }

    @Override
    public boolean addPost() {
        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN POST!");
        return true;
    }

    public String getName() {
        System.out.println("GetterName");
        return name;
    }

    public void setName(String name) {
        System.out.println("SetterName");
        this.name = name;
    }

    public String getPassword() {
        System.out.println("GetterPassword");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("SetterPassword");
        this.password = password;
    }
}
