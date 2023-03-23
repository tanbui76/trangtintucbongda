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
}
