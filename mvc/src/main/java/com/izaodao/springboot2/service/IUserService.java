package com.izaodao.springboot2.service;

import com.izaodao.springboot2.entity.User;

import java.util.List;

/**
 * user接口
 *
 * @author mengqingnan
 * @since 2018-04-27 23:18
 **/
public interface IUserService {
    List<User> findList();
}
