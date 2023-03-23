package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.AccountEntity;

import java.util.List;


public interface AccountService {
    List<AccountEntity> getAllAccount();

    AccountEntity getAccountByUserAndPass(String Username, String Password);

    AccountEntity addAccount(AccountEntity account);
}
