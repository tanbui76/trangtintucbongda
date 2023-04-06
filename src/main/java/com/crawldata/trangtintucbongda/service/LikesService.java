package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.LikesEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;

public interface LikesService {
//    LikesEntity addLike(AccountEntity accountEntity, NewsEntity newsEntity);
    LikesEntity addLike(Long account_id, Long news_id);
}
