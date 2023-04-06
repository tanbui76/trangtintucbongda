package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.SavedEntity;
import com.crawldata.trangtintucbongda.service.AccountService;
import com.crawldata.trangtintucbongda.service.NewsService;
import com.crawldata.trangtintucbongda.service.SavedService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saved")


public class SavedAPI {
    private SavedService savedService;
    private AccountService accountService;
    private NewsService newsService;

    public SavedAPI(SavedService savedService, AccountService accountService, NewsService newsService) {
        this.savedService = savedService;
        this.accountService = accountService;
        this.newsService = newsService;
    }

    @CrossOrigin
    @GetMapping("/savedNews")

    public SavedEntity savedNews(Long account_id, Long news_id){
        SavedEntity savedEntity = new SavedEntity();
        savedEntity.setAccount(accountService.getAccountById(account_id));
        savedEntity.setNews(newsService.getNewsById(news_id));
        return savedService.savedNews(savedEntity);
    }


}
