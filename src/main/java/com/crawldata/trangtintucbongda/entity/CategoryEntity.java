package com.crawldata.trangtintucbongda.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

@Entity

public class CategoryEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @OneToMany(mappedBy = "Viewed", cascade = CascadeType.ALL)
    private int category_id ;
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

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "category_id=" + category_id +
                ", category_name=" + category_name +
                '}';
    }
}
