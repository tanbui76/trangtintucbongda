package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.dto.AccountDTO;
import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.ViewedEntity;
import com.crawldata.trangtintucbongda.service.AccountService;
import com.crawldata.trangtintucbongda.service.NewsService;
import com.crawldata.trangtintucbongda.service.ViewedService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viewed")
public class ViewedAPI {
    private ViewedService viewedService;
    private AccountService accountService;
    private NewsService newsService;

    public ViewedAPI(ViewedService viewedService, AccountService accountService, NewsService newsService) {
        this.viewedService = viewedService;
        this.accountService = accountService;
        this.newsService = newsService;
    }

    @CrossOrigin
    @GetMapping("/getViewsNews/{id}")
    public List<NewsEntity> getAllViewed(@PathVariable("id") Long account_id){
        return viewedService.getAllNewsViewed(account_id);
    }

    @CrossOrigin
    @PostMapping("/addViewed")
    public ViewedEntity addNewsViewed(String account_id, String news_id){
        Long idacc = Long.parseLong(account_id);
        Long idnews = Long.parseLong(news_id);
        ViewedEntity viewedEntity = new ViewedEntity();
        viewedEntity.setAccount(accountService.getAccountById(idacc));
        viewedEntity.setNews(newsService.getNewsById(idnews));
        return viewedService.addViewed(viewedEntity);
    }
}
