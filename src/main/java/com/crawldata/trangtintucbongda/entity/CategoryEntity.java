package com.crawldata.trangtintucbongda.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category")
public class CategoryEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int category_id ;

   @OneToMany
   @JoinColumn(name = "category_id")
   private List<NewsEntity> newsEntitys = new ArrayList<>();


    @Column(name = "category_name")
    private int category_name;

    public int getCategory_name() {
        return category_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_name(int category_name) {
        this.category_name = category_name;
    }


}
