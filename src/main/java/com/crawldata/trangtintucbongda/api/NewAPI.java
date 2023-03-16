package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.TinTucEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {
    @GetMapping("/new")
    public TinTucEntity getNew() {
        TinTucEntity tinbongda = new TinTucEntity("Tin tuc bong da","anh 1","bao ngaasdsdsdsds");
        return  tinbongda;
    }
}
