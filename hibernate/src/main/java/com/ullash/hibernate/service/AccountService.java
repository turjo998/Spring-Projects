package com.ullash.hibernate.service;

import com.ullash.hibernate.dao.AccountDAO;
import com.ullash.hibernate.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    @Qualifier("AccountDAOImp2")
    AccountDAO accountDAO;

    public Account findById(long id) {
        return accountDAO.findByAccountId(id);
    }

    public void saveAccount(Account account) {
        accountDAO.save(account);
    }

    public void update(Account account) {
        accountDAO.update(account);
    }

    public void deleteAccount(Account account) {
        accountDAO.delete(account);
    }

    public List getAllAccounts() {
        return accountDAO.accountList();
    }


    public void performTransaction(long accountId1, long accountId2, double amount) {
        accountDAO.performTransaction(accountId1 , accountId2 , amount);
    }
}
