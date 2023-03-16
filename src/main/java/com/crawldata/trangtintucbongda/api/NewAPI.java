package com.crawldata.trangtintucbongda.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {
    @GetMapping("/new")
    public String getNew() {
        return "Hello";
    }
}
