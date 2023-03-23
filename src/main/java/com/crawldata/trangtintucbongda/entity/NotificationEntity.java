package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Notification")
public class NotificationEntity {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notification_id;

    @Column(name = "notification_content", columnDefinition = "nvarchar(max)")
    private String notification_content;

    @Column(name = "notification_title", columnDefinition = "nvarchar(max)")
    private String notification_title;

    @Column(name = "notification_datetime", columnDefinition = "nvarchar(max)")
    private String notification_datetime;

    public NotificationEntity() {
    }

    public NotificationEntity(String notification_content, String notification_title, String notification_datetime) {
        this.notification_content = notification_content;
        this.notification_title = notification_title;
        this.notification_datetime = notification_datetime;
    }

    public String getNotification_content() {
        return notification_content;
    }

    public void setNotification_content(String notification_content) {
        this.notification_content = notification_content;
    }

    public String getNotification_title() {
        return notification_title;
    }

    public void setNotification_title(String notification_title) {
        this.notification_title = notification_title;
    }

    public String getNotification_datetime() {
        return notification_datetime;
    }

    public void setNotification_datetime(String notification_datetime) {
        this.notification_datetime = notification_datetime;
    }

    public Long getNotification_id() {
        return notification_id;
    }


}
