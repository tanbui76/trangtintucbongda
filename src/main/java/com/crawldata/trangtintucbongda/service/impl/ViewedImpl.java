package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.entity.ViewedEntity;
import com.crawldata.trangtintucbongda.repository.ViewedRepository;
import com.crawldata.trangtintucbongda.service.ViewedService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViewedImpl implements ViewedService {
    private ViewedRepository  viewedRepository;


    public ViewedImpl(ViewedRepository viewedRepository) {
        this.viewedRepository = viewedRepository;
    }

    @Override
    public List<ViewedEntity> getAllViewed() {
        return viewedRepository.findAll();
    }

    @Override
    public List<NewsEntity> getAllNewsViewed(Long account_id) {
        return viewedRepository.getAllNewsViewed(account_id);
    }

    @Override
    public ViewedEntity addViewed(ViewedEntity viewedEntity) {
        return viewedRepository.save(viewedEntity);
    }
}
