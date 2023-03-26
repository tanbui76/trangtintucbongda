package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsAPI {
    private NewsService newsService;

    public NewsAPI(NewsService newsService) {
        this.newsService = newsService;
    }

    @CrossOrigin
    @GetMapping("/getAllNews")
    public List<NewsEntity> getAllNews() {
        return newsService.getAllNews();
    }

    @CrossOrigin
    @GetMapping("/getNewsByID/{id}")
    public NewsEntity getNewsByID(@PathVariable Long id){
        return newsService.getNewsById(id);
    }

    @CrossOrigin
    @GetMapping("/getAllNewsByCategoryID/{id}")
    public List<NewsEntity> getAllNewsByCategoryID(@PathVariable Long id){
        return newsService.getAllNewsByCategoryId(id);
    }
}
