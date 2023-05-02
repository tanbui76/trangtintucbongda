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

    @Override

    public AccountEntity getAccountByUserAndPass(String Username, String Password) {
        return accountRepository.getAccountByUserAndPass(Username, Password);
    }



    @Override
    public AccountEntity addAccount(AccountEntity account) {
        return accountRepository.save(account);
    }

    @Override
    public int updateAccountFullName(Long account_id, String account_fullname) {

        return accountRepository.updateAccountFullName(account_fullname,account_id);
    }

    @Override
    public int updateAccountEmail(Long account_id, String account_email) {
        return accountRepository.updateAccountEmail(account_email,account_id);
    }

//    @Override
//    public AccountEntity getAccountById(Long account_id) {
//        return accountRepository.getById(account_id);
//    }
@Override
public AccountEntity getAccountById(Long account_id) {
    return accountRepository.findById(account_id).get();
}

}
