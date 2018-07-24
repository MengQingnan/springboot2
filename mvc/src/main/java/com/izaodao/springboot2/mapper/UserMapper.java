package com.izaodao.springboot2.mapper;

import com.izaodao.springboot2.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UserMapper
 *
 * @author mengqingnan
 * @since 2018-04-27 23:15
 **/
@Mapper
public interface UserMapper {
    List<User> findList();
}
