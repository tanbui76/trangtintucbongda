package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.ViewedEntity;
import com.crawldata.trangtintucbongda.service.AccountService;
import com.crawldata.trangtintucbongda.service.NewsService;
import com.crawldata.trangtintucbongda.service.ViewedService;
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
    public ViewedEntity addNewsViewed(@RequestParam Long account_id,@RequestParam Long news_id){
        ViewedEntity viewedEntity = new ViewedEntity();
        viewedEntity.setAccount(accountService.getAccountById(account_id));
        viewedEntity.setNews(newsService.getNewsById(news_id));
        System.out.println("tin đã xem");
        return viewedService.addViewed(viewedEntity);
    }
}
