package com.luka.aopdemo.DAO;

import com.luka.aopdemo.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT!");
    }

    @Override
    public boolean addPost() {
        System.out.println(getClass() + " : DOING MY DB WORK: ADDING AN POST!");
        return true;
    }
}
