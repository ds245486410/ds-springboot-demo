package com.hellen.springboot.mapper;

import com.hellen.springboot.DruidMybatisApplicationTests;
import com.hellen.springboot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author daiweihang
 * @date 2019/5/8
 */
@Slf4j
public class UserMapperTest  extends DruidMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList(){
        List<User> users = userMapper.listAll();
        log.info("alluser : [{}]" , users);
        for (User user : users) {
            log.info("姓名 ; [{}]",user.getName());
            log.info("电话 ; [{}]",user.getPhone());
            log.info("性别 ; [{}]",user.getSexName());
            log.info("创建时间 ; [{}]",user.getCredateAt());
        }
    }
}
