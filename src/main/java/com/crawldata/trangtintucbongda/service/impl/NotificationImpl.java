package com.crawldata.trangtintucbongda.service.impl;

import com.crawldata.trangtintucbongda.entity.NotificationEntity;
import com.crawldata.trangtintucbongda.repository.NotificationRepository;
import com.crawldata.trangtintucbongda.service.NotificationService;

import java.util.List;

public class NotificationImpl implements NotificationService {
    private NotificationRepository notificationRepository;

    @Override
    public List<NotificationEntity> getAllNotification() {
        return notificationRepository.findAll();
    }
}
