package com.izaodao.springboot2.es.controller;

import com.izaodao.springboot2.es.dao.JapanesedoyenRepository;
import com.izaodao.springboot2.es.dao.ZaodaodnhzxRepository;
import com.izaodao.springboot2.es.entity.Japanesedoyen;
import com.izaodao.springboot2.es.entity.ZaodaoDnhzx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ss
 *
 * @author mengqingnan
 * @since 2018-07-24 23:12
 **/
@RestController
@RequestMapping("/es")
public class ElasticSearchController {

    @Autowired
    private JapanesedoyenRepository er;

    @Autowired
    private ZaodaodnhzxRepository zaodaodnhzxRepository;

    //增加
    @RequestMapping("/add/{id}")
    public String add(@PathVariable("id")String id){

        ZaodaoDnhzx zaodaoDnhzx=new ZaodaoDnhzx();
        zaodaoDnhzx.setId(id);
        zaodaoDnhzx.setName("mqn");
        zaodaoDnhzx.setSex("1");
        zaodaodnhzxRepository.save(zaodaoDnhzx);

        return "success";
    }

    //查询
    @RequestMapping("/query1/{id}")
    public ZaodaoDnhzx query1(@PathVariable("id")String id){

        ZaodaoDnhzx accountInfo = zaodaodnhzxRepository.queryZaodaoDnhzxById(id);
        return accountInfo;
    }
//
//    //删除
//    @RequestMapping("/delete")
//    public String delete(){
//        Japanesedoyen Japanesedoyen=new Japanesedoyen();
//        Japanesedoyen.setId("1");
//        er.delete(Japanesedoyen);
//
//        return "success";
//    }
//
//    //局部更新
//    @RequestMapping("/update")
//    public String update(){
//
//        Japanesedoyen Japanesedoyen=er.queryJapanesedoyenById("1");
//        Japanesedoyen.setFirstName("哈哈");
//        er.save(Japanesedoyen);
//
//        System.err.println("update a obj");
//
//        return "success";
//    }

    //查询
    @RequestMapping("/query/{id}")
    public Japanesedoyen query(@PathVariable("id")String id){

        Japanesedoyen accountInfo=er.queryJapanesedoyenBy_id(id);
        return accountInfo;
    }

}
