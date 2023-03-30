package com.crawldata.trangtintucbongda.api;

import com.crawldata.trangtintucbongda.entity.NotificationEntity;
import com.crawldata.trangtintucbongda.repository.NotificationRepository;
import com.crawldata.trangtintucbongda.service.NotificationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/notifications")
public class NotificationAPI {
    private NotificationService notificationService;

    public NotificationAPI(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @CrossOrigin
    @GetMapping("/getAllNotifications")
    public List<NotificationEntity> getAllNotification(){
        return  notificationService.getAllNotification();
    }

}
