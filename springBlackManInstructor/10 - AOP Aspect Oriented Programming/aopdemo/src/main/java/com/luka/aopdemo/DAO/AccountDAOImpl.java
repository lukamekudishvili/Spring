package com.luka.aopdemo.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount() {
        System.out.println(getClass().getSimpleName() + " : DOING MY DB WORK: ADDING AN ACCOUNT!");
    }
}
