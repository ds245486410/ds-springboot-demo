package com.hellen.springboot.controller;

import com.hellen.springboot.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daiweihang
 * @date 2019/4/26
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/index")
    public String index(Model model){
        List<StudentDTO> list = new ArrayList<>();
        StudentDTO studentDTO = null;

        studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setName("张三");
        studentDTO.setAge("10");
        list.add(studentDTO);
//        studentDTO = new StudentDTO();
//        studentDTO.setId(2L);
//        studentDTO.setName("李四");
//        studentDTO.setAge("11");
//        list.add(studentDTO);

//        studentDTO = new StudentDTO();
//        studentDTO.setId(3L);
//        studentDTO.setName("王五");
//        studentDTO.setAge("12");
//        list.add(studentDTO);

        model.addAttribute("list",list);

        model.addAttribute("student" , studentDTO);
        return "index";
    }

    @RequestMapping("/show")
    public String show(Model model){
        return "show";
    }

}
