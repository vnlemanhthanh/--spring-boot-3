package com.vnlemanhthanh.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Override
    public void addAccount() {
        System.out.println(this + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
