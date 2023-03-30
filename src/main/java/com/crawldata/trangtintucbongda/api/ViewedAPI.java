package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.ViewedEntity;
import com.crawldata.trangtintucbongda.service.ViewedService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewed")
public class ViewedAPI {
    private ViewedService viewedService;

    public ViewedAPI(ViewedService viewedService) {
        this.viewedService = viewedService;
    }

    @CrossOrigin
    @GetMapping
    public List<ViewedEntity> getAllViewed(){
        return viewedService.getAllViewed();
    }

}
