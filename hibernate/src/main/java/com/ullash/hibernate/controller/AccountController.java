package com.ullash.hibernate.controller;

import com.ullash.hibernate.dto.Account;
import com.ullash.hibernate.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/detail")
    public Account detail(@RequestParam long accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping("/new")
    public void newAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @PutMapping("/update")
    void updateAccount(@RequestBody Account account) {
        accountService.update(account);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody Account account) {
        accountService.deleteAccount(account);
    }

    @GetMapping()
    public List allAccount() {
        return accountService.getAllAccounts();
    }


    @PostMapping("/transaction")
    public void performTransaction(
            @RequestParam long accountId1,
            @RequestParam long accountId2,
            @RequestParam double amount) {

        accountService.performTransaction(accountId1, accountId2, amount);


    }

}