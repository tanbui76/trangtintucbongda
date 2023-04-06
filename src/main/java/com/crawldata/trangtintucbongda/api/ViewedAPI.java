package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.dto.AccountDTO;
import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.ViewedEntity;
import com.crawldata.trangtintucbongda.service.ViewedService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viewed")
public class ViewedAPI {
    private ViewedService viewedService;

    public ViewedAPI(ViewedService viewedService) {
        this.viewedService = viewedService;
    }

    @CrossOrigin
    @GetMapping("/getViewsNews/{id}")
    public List<NewsEntity> getAllViewed(@PathVariable("id") Long account_id){
        return viewedService.getAllNewsViewed(account_id);
    }

    @CrossOrigin
    @PostMapping("/addViewed")
    public ViewedEntity addNewsViewed(AccountEntity accountEntity, NewsEntity newsEntity){


        return viewedService.addViewed(viewedEntity);
    }
}
