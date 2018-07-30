package com.izaodao.springboot2.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @Auther: Mengqingnan
 * @Description:
 * @Date: 2018/7/26 下午4:30
 * Copyright (c) 2018, zaodao All Rights Reserved.
 */
@Document(indexName = "zaodaodnhzx", type = "zaodaodnhzx", shards = 1, replicas = 0, refreshInterval = "30s")
public class ZaodaoDnhzx {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
