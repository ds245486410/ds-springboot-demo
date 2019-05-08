package com.hellen.springboot.mapper;


import com.hellen.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> listAll();
    Integer insert(User user);
}
