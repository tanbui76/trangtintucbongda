package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.LikesEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.repository.AccountRepository;
import com.crawldata.trangtintucbongda.repository.LikesRepository;
import com.crawldata.trangtintucbongda.repository.NewsRepository;
import com.crawldata.trangtintucbongda.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;
import java.util.Optional;

@Service
public class LikesImpl implements LikesService {
    @Autowired
    private LikesRepository likesRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public LikesEntity addLike(Long account_id, Long news_id) {
        LikesEntity likesEntity = new LikesEntity();
        AccountEntity accountEntity = accountRepository.findById(account_id)
                .orElseThrow(() -> new RuntimeException("ko tìm thấy account_id"+ account_id));
        NewsEntity newsEntity = newsRepository.findById(news_id)
                .orElseThrow(() ->new RuntimeException("ko tìm thấy news_id"+news_id));
        likesEntity.setAccount(accountEntity);
        likesEntity.setNews(newsEntity);
        return likesRepository.save(likesEntity);
    }

//    public LikesImpl(LikesRepository likesRepository) {
//        this.likesRepository = likesRepository;
//    }

//    public LikesImpl(LikesRepository likesRepository, AccountRepository accountRepository, NewsRepository newsRepository) {
//        this.likesRepository = likesRepository;
//        this.accountRepository = accountRepository;
//        this.newsRepository = newsRepository;
//    }

//    @Transactional
//    @Override
//    public LikesEntity addLike(AccountEntity accountEntity, NewsEntity newsEntity) {
//
//        LikesEntity likesEntity = new LikesEntity();
//        if(accountEntity.getAccount_id() == null){
//            throw new IllegalArgumentException("ko có id");
//        }
////        AccountEntity account = accountRepository.save(accountEntity);
////        NewsEntity news = newsRepository.save(newsEntity);
//        likesEntity.setAccount(accountEntity);
//        likesEntity.setNews(newsEntity);
//        return likesRepository.save(likesEntity);
////        Long id = newsEntity.getNews_id();
////        Long idAccount =accountEntity.getAccount_id();
////        if(Objects.isNull(idAccount)){
////            throw new IllegalArgumentException("Account ID cannot be null");
////        }
////        System.out.println(idAccount);
////
////        if(Objects.isNull(id)){
////            throw new IllegalArgumentException("News ID cannot be null");
////        }
////
////        AccountEntity savedAccount = accountRepository.save(accountEntity);
////        Optional<NewsEntity> exittingNews = newsRepository.findById(newsEntity.getNews_id());
////        if(exittingNews.isPresent()){
////            likesEntity.setAccount(savedAccount);
////            likesEntity.setNews(exittingNews.get());
////            return likesRepository.save(likesEntity);
////        }
////        else {
////            throw new RuntimeException("Cannot find news with ID: " + newsEntity.getNews_id());
////        }
//
//    }




}
