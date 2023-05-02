package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.repository.NewsRepository;
import com.crawldata.trangtintucbongda.service.NewsService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
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

    @Override
    public List<NewsEntity> getAllNewsEqualTwoDay() {
        LocalDateTime endDate = LocalDateTime.now();
        LocalDateTime startDate = endDate.minusDays(2);
        Date startDateUtil = Date.from(startDate.atZone(ZoneId.systemDefault()).toInstant());
        Date endDateUtil = Date.from(endDate.atZone(ZoneId.systemDefault()).toInstant());
        return newsRepository.getAllNewsEqualTwoDay(startDateUtil, endDateUtil);
    }



}
