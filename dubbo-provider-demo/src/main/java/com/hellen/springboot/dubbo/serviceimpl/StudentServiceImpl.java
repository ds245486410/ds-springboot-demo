package com.hellen.springboot.dubbo.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hellen.springboot.dto.StudentDTO;
import com.hellen.springboot.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daiweihang
 * @date 2019/4/24
 */
@Service(interfaceClass = StudentService.class)
@Component
public class StudentServiceImpl implements StudentService {
    @Override
    public List<StudentDTO> findList() {
        ArrayList<StudentDTO> list = new ArrayList<>();
        StudentDTO studentDTO = null;

        studentDTO = new StudentDTO();
        studentDTO.setId(11L);
        studentDTO.setName("张三");
        studentDTO.setAge("11");
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(12L);
        studentDTO.setName("李四");
        studentDTO.setAge("12");
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(13L);
        studentDTO.setName("王五");
        studentDTO.setAge("13");
        list.add(studentDTO);
        return list;
    }
}
