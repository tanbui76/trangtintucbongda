package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.repository.AccountRepository;
import com.crawldata.trangtintucbongda.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountImpl (AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public List<AccountEntity> getAllAccount() {
        return accountRepository.findAll();
    }
}