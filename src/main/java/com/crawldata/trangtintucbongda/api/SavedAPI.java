package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.SavedEntity;
import com.crawldata.trangtintucbongda.service.AccountService;
import com.crawldata.trangtintucbongda.service.NewsService;
import com.crawldata.trangtintucbongda.service.SavedService;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class SavedAPI {
    private SavedService savedService;
    private AccountService accountService;
    private NewsService newsService;

    public SavedAPI(SavedService savedService) {
        this.savedService = savedService;
    }

    public SavedEntity savedNews(Long account_id, Long news_id){
        SavedEntity savedEntity = new SavedEntity();
        AccountEntity accountEntity = new AccountEntity();
//        accountEntity.getAccount_id(accountService.)


        return null;
    }


}
