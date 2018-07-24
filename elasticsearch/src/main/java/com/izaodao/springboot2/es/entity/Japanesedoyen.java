package com.izaodao.springboot2.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * 测试
 *
 * @author mengqingnan
 * @since 2018-07-24 23:06
 **/
@Document(indexName = "japanesedoyensboot",type = "japanese_doyen_sboot", shards = 1,replicas = 0, refreshInterval = "-1")
public class Japanesedoyen {
    @Id
    private String _id;
    @Field
    private String level;
    @Field
    private String message;
    @Field
    private String index;
    @Field
    private String type;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}