package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.AccountEntity;

import java.util.List;


public interface AccountService {
    List<AccountEntity> getAllAccount();

    AccountEntity getAccountByUserAndPass(String Username, String Password);

    AccountEntity addAccount(AccountEntity account);

    int updateAccountFullName(Long account_id, String account_fullname);

    int updateAccountEmail(Long account_id, String account_email);

    AccountEntity getAccountById(Long account_id);

}
