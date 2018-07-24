package com.izaodao.springboot2.es.dao;

import com.izaodao.springboot2.es.entity.Japanesedoyen;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * ceshi
 *
 * @author mengqingnan
 * @since 2018-07-24 23:11
 **/
@Component
public interface JapanesedoyenRepository extends ElasticsearchRepository<Japanesedoyen,String> {
    Japanesedoyen queryJapanesedoyenBy_id(String id);
}
