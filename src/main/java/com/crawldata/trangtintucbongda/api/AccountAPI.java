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

    @CrossOrigin
    @PostMapping("/updateAccountFullName")
    public int updateAccountFullName(Long account_id, String account_fullname){
        return accountService.updateAccountFullName(account_id,account_fullname);
    }

    @CrossOrigin
    @PostMapping("/updateAccountEmail")
    public int updateAccountEmail(Long account_id, String account_email){
        return accountService.updateAccountEmail(account_id,account_email);
    }
    @CrossOrigin
    @RequestMapping("/getAccountId")
    public AccountEntity getIdAccount(Long account_id){
        return  accountService.getAccountById(account_id);
    }

    @CrossOrigin
    @PostMapping("/updateAccountPass")
    public int updateAccountPass(Long account_id, String account_pass){
        return accountService.updateAccountPass(account_id, account_pass);

    }

    @CrossOrigin
    @PostMapping("/updateAccountAddress")
    public int updateAccountAddress(Long account_id, String account_country){
        System.out.println("success");
        return accountService.updateAccountAddress(account_id, account_country);

    }

    @CrossOrigin
    @PostMapping("/updateAccountGender")
    public int updateAccountGender(Long account_id, String account_gender){
        return accountService.updateAccountGender(account_id, account_gender);
    }

    @CrossOrigin
    @PostMapping("/updateAccountTelephone")
    public int updateAccountTelephone(Long account_id, String account_telephone){
        System.out.println("succes");
        return accountService.updateAccountTelephone(account_id, account_telephone);

    }

    @CrossOrigin
    @PostMapping("/updateAccountBirthday")
    public int updateAccountBirthday(Long account_id, String account_birthday){
        return accountService.updateAccountBirthday(account_id, account_birthday);
    }



}
