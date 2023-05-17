package com.ullash.hibernate.dao;

import com.ullash.hibernate.dto.Account;

import java.util.List;

public interface AccountDAO {
    void save(Account account);

    Account findByAccountId(long id);

    void delete(Account account);

    void update(Account account);

    List<Account> accountList();

    void performTransaction(long accountId1, long accountId2, double amount);
}
