package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.SavedEntity;
import com.crawldata.trangtintucbongda.repository.SavedRepository;
import com.crawldata.trangtintucbongda.service.SavedService;
import org.springframework.stereotype.Service;

@Service
public class SavedImpl implements SavedService {
    private SavedRepository savedRepository;

    public SavedImpl(SavedRepository savedRepository) {
        this.savedRepository = savedRepository;
    }

    @Override
    public SavedEntity savedNews(SavedEntity savedEntity) {
        return  savedRepository.save(savedEntity);
    }
}
