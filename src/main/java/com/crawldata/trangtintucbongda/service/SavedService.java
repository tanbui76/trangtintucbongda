package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.SavedEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SavedService {
    SavedEntity savedNews(SavedEntity savedEntity);
    List<NewsEntity> getAllNewsSaved(Long account_id);
}
