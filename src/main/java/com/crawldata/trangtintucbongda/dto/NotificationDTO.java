package com.crawldata.trangtintucbongda.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class NotificationDTO {
    private Long notification_id;
    private String notification_content;
    private String notification_title;
    private String notification_datetime;

    public NotificationDTO() {
    }

    public NotificationDTO(Long notification_id, String notification_content, String notification_title, String notification_datetime) {
        this.notification_id = notification_id;
        this.notification_content = notification_content;
        this.notification_title = notification_title;
        this.notification_datetime = notification_datetime;
    }

    public Long getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(Long notification_id) {
        this.notification_id = notification_id;
    }

    public String getNotification_content() {
        return notification_content;
    }

    public void setNotification_content(String notification_content) {
        this.notification_content = notification_content;
    }


}
