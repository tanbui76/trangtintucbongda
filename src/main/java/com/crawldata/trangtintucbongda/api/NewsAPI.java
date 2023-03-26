package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

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
    @CrossOrigin
    @GetMapping("/getRandomId")
    public NewsEntity getNewsRandomId(){
        List<Long> listNewsId = newsService.getAllNewsId();
        Random random = new Random();
        Long next = listNewsId.get((int) random.nextLong(listNewsId.size())) ;
        return newsService.getNewsRandomId(next);

    }


}
