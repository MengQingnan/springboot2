package com.izaodao.springboot2.mvc.controller;

import com.izaodao.springboot2.entity.User;
import com.izaodao.springboot2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * user controller
 *
 * @author mengqingnan
 * @since 2018-04-27 23:20
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;


    @GetMapping(value = "list")
    public List<User> findUsers(){
        return userService.findList();
    }

    public static  void  main(String[] args){
        int i = 0;

        i++;

        System.out.println(i);
    }
}
