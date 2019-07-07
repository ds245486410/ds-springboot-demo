package com.hellen.springboot.mapper;

import com.hellen.springboot.DruidMybatisApplicationTests;
import com.hellen.springboot.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
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
            log.info("创建时间 ; [{}]",user.getCredateAt());
        }
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("张三");
        user.setPhone("18825155657");
        user.setSex(1);
        user.setPicture("/img");
        user.setCreateBy("systemOperatr");
        user.setCredateAt(new Date());
        user.setUpdateBy("systemOperator");
        user.setUpdateAt(new Date());
        int insertNum = userMapper.insert(user);
        Assert.assertEquals(1 , insertNum);
    }
}
