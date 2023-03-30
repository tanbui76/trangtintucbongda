package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.NotificationEntity;
import com.crawldata.trangtintucbongda.repository.NotificationRepository;
import com.crawldata.trangtintucbongda.service.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationImpl implements NotificationService {
    private NotificationRepository notificationRepository;

    public NotificationImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public List<NotificationEntity> getAllNotification() {
        return notificationRepository.findAll();
    }
}
