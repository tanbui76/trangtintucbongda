package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountAPI {
    private AccountService accountService;

    public AccountAPI(AccountService accountService){
        this.accountService = accountService;
    }

    @CrossOrigin
    @GetMapping
    public List<AccountEntity> getAllAccount(){
        return accountService.getAllAccount();
    }

    @CrossOrigin
    @PostMapping("/getAccountByUserAndPass")
    public  AccountEntity getAccountByUserAndPass(String Username, String Password){
        return accountService.getAccountByUserAndPass(Username, Password);
    }



    @CrossOrigin
    @PostMapping("/addAccount")
    public AccountEntity addAccount(String account_username,String account_telephone,String account_fullname, String account_email,String account_password){
        AccountEntity account = new AccountEntity();
        account.setAccount_email(account_email);
        account.setAccount_telephone(account_telephone);
        account.setAccount_fullname(account_fullname);
        account.setAccount_username(account_username);
        account.setAccount_password(account_password);
        return accountService.addAccount(account);
    }
}
