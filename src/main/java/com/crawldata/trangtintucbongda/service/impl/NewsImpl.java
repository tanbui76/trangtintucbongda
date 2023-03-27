package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.repository.NewsRepository;
import com.crawldata.trangtintucbongda.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsImpl implements NewsService {
    private NewsRepository newsRepository;

    public NewsImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }


    @Override
    public List<NewsEntity> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public NewsEntity getNewsById(Long id) {
        return newsRepository.findById(id).get();
    }

    @Override
    public List<NewsEntity> getAllNewsByCategoryId(Long id) {
        return newsRepository.getAllByCategoryEntityId(id);
    }


    @Override
    public NewsEntity saveNews(NewsEntity newsEntity) {
        return null;
    }

    @Override
    public NewsEntity updateNews(NewsEntity newsEntity) {
        return null;
    }

    @Override
    public void deleteNews(int id) {

    }

    @Override
    public List<Long> getAllNewsId() {
        return newsRepository.getListIdNews();
    }

    @Override
    public NewsEntity getNewsRandomId(Long id) {
        return newsRepository.getNewsRandomId(id);
    }


}
