package com.hellen.springboot.dubboconsumerdemo.service;

import com.hellen.springboot.dubboconsumerdemo.DubboConsumerDemoApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author daiweihang
 * @date 2019/4/24
 */
@Slf4j
public class StudentServiceTest extends DubboConsumerDemoApplicationTests {
    @Autowired
    private StudentConsumer studentConsumer;

    @Test
    public void testFindList(){
        studentConsumer.findList();
    }
}
