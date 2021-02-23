package com.speed.fast.dao;

import com.speed.fast.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IUserMapper {

    @Select("select * from user where username like '%${value}%'")
    List<User> getUserByName(String name);
}
