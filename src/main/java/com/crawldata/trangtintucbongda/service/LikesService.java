package com.crawldata.trangtintucbongda.service;

import com.crawldata.trangtintucbongda.entity.LikesEntity;

public interface LikesService {
//    LikesEntity addLike(AccountEntity accountEntity, NewsEntity newsEntity);
    LikesEntity addLike(Long account_id, Long news_id);
}
