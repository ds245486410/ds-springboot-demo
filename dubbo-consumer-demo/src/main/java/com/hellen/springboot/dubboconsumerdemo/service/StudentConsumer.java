package com.hellen.springboot.dubboconsumerdemo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hellen.springboot.dto.StudentDTO;
import com.hellen.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author daiweihang
 * @date 2019/4/24
 */
@Component
@Slf4j
public class StudentConsumer {
    @Reference
    private StudentService studentService;
    public void findList(){
        List<StudentDTO> list = studentService.findList();
        log.info(list.toString());
    }
}
