package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.AccountEntity;
import com.crawldata.trangtintucbongda.entity.LikesEntity;
import com.crawldata.trangtintucbongda.entity.NewsEntity;
import com.crawldata.trangtintucbongda.service.LikesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like")
public class LikesAPI {
    private LikesService likesService;
    public LikesAPI(LikesService likesService) {
        this.likesService = likesService;

    }
//    @CrossOrigin
//    @PostMapping("/likesAdd")
//    public LikesEntity likeAdd(AccountEntity accountEntity, NewsEntity newsEntity){
//        LikesEntity likesEntity = new LikesEntity();
//        likesEntity.setAccount(accountEntity);
//        likesEntity.setNews(newsEntity);
//        return  likesService.addLike(accountEntity, newsEntity);
//    }
@CrossOrigin
@PostMapping("/likesAdd")
public LikesEntity likeAdd(Long account_id,  Long news_id){
        return likesService.addLike(account_id, news_id);


}

}
