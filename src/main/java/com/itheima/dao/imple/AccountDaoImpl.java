package com.itheima.dao.imple;

import com.itheima.dao.IAccountDao;

/*
账号的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("Account saved!");
    }
}
