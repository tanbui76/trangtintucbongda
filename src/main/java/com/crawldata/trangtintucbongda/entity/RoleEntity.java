package com.crawldata.trangtintucbongda.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @OneToMany(mappedBy = "role_id")
    private List<AccountEntity> accountEntities;

    @Column(name = "role_name")
    private String role_name;

    public RoleEntity() {
    }

    public RoleEntity(String role_name) {
        this.role_name = role_name;
    }

    public Long getRole_id() {
        return role_id;
    }


    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
