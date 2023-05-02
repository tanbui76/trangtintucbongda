package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.SavedEntity;
import com.crawldata.trangtintucbongda.repository.SavedRepository;
import com.crawldata.trangtintucbongda.service.SavedService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<NewsEntity> getAllNewsSaved(Long account_id) {
        return savedRepository.getListNewSaved(account_id);
    }
}
