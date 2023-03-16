package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.model.account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class testRestAPI {
    @PostMapping("/test")
    public account test(@RequestBody account Account) {
        return Account;
    }
}
