package com.izaodao.springboot2.es.dao;

import com.izaodao.springboot2.es.entity.ZaodaoDnhzx;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ceshi
 *
 * @author mengqingnan
 * @since 2018-07-24 23:11
 **/
@Component
public interface ZaodaodnhzxRepository extends ElasticsearchRepository<ZaodaoDnhzx,String> {
    ZaodaoDnhzx queryZaodaoDnhzxById(String id);

    List<ZaodaoDnhzx> save(List<ZaodaoDnhzx> list);
}
