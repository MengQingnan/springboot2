package com.izaodao.springboot2.service.impl;

import com.izaodao.springboot2.entity.User;
import com.izaodao.springboot2.mapper.UserMapper;
import com.izaodao.springboot2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user 实现类
 *
 * @author mengqingnan
 * @since 2018-04-27 23:19
 **/
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        return userMapper.findList();
    }
}
