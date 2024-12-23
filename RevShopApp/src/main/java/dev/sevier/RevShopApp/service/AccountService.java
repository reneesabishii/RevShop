package dev.sevier.RevShopApp.service;

import org.springframework.stereotype.Service;

import dev.sevier.RevShopApp.entity.Account;
import dev.sevier.RevShopApp.repository.AccountRepository;


@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account registerAccount(Account account) {
        Account user = accountRepository.findAccount(account.getUsername());
        if (user != null) {
            return null;
        }

        System.out.println("Before saving account: " + account);

        Account savedAccount = accountRepository.save(account);

        System.out.println("After saving account: " + savedAccount);

        return savedAccount;
    }


    public Account loginAccount(Account account) {
        Account a = accountRepository.findAccount(account.getUsername());
        if (a == null) {
            return null;
        }
        return a;
    }
}