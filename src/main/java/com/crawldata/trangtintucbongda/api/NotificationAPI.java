package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.NotificationEntity;
import com.crawldata.trangtintucbongda.repository.NotificationRepository;
import com.crawldata.trangtintucbongda.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationAPI {
    private NotificationService notificationService;
    @GetMapping("/notifications")
    public List<NotificationEntity> getAllNotification(){
        return  notificationService.getAllNotification();
    }

}
