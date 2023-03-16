package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tintuc")
public class TinTucEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tintuc_title")
    private String tintuc_title;

    @Column(name = "tintuc_image")
    private String tintuc_image;

    @Column(name = "tintuc_description")
    private String tintuc_description;

    TinTucEntity() {
    }

    public TinTucEntity(String tintuc_title, String tintuc_image, String tintuc_description) {
        this.tintuc_title = tintuc_title;
        this.tintuc_image = tintuc_image;
        this.tintuc_description = tintuc_description;
    }

    public String getTintuc_title() {
        return tintuc_title;
    }

    public long getId() {
        return id;
    }


    public void setTintuc_title(String tintuc_title) {
        this.tintuc_title = tintuc_title;
    }

    public String getTintuc_image() {
        return tintuc_image;
    }

    public void setTintuc_image(String tintuc_image) {
        this.tintuc_image = tintuc_image;
    }

    public String getTintuc_description() {
        return tintuc_description;
    }

    public void setTintuc_description(String tintuc_description) {
        this.tintuc_description = tintuc_description;
    }
}
