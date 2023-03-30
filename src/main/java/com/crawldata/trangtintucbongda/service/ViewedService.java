package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.ViewedEntity;

import java.util.List;

public interface ViewedService {
    List<ViewedEntity> getAllViewed();

    List<NewsEntity> getAllNewsViewed (Long account_id);
}
