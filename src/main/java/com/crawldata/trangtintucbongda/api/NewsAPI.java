package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.service.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsAPI {
    private NewsService newsService;

    public NewsAPI(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<NewsEntity> getAllNews() {
        return newsService.getAllNews();
    }
}
