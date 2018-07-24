package com.izaodao.springboot2.entity;

/**
 * User
 *
 * @author mengqingnan
 * @since 2018-04-27 23:15
 **/
public class User {
    private Long id;

    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
