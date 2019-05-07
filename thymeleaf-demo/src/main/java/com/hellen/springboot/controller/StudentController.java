package com.hellen.springboot.controller;

import com.hellen.springboot.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author daiweihang
 * @date 2019/4/26
 */
@Controller
@Slf4j
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
        studentDTO.setPassed(false);
        studentDTO.setDate(new Date());
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(2L);
        studentDTO.setName("李四");
        studentDTO.setAge("11");
        studentDTO.setPassed(true);
        studentDTO.setDate(new Date());
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(3L);
        studentDTO.setName("王五");
        studentDTO.setAge("12");
        studentDTO.setPassed(true);
        studentDTO.setDate(new Date());
        list.add(studentDTO);

        model.addAttribute("list",list);
        HashMap<String, String> headers = new HashMap<>();
        headers.put("id" , "id");
        headers.put("name" , "姓名");
        headers.put("age" , "年龄");
        headers.put("date" , "日期");
        headers.put("passed" , "结果");
        model.addAttribute("heaers" , headers);
        model.addAttribute("student" , studentDTO);
        model.addAttribute("datePlanted" , "准高三");
        return "index";
    }

    @RequestMapping("/show")
    public String show(Model model){
        return "show";
    }

    @RequestMapping("/add")
    public String add(StudentDTO studentDTO , Model model){
        log.info("添加 ： [{}]" , studentDTO);
        model.addAttribute("student" ,  studentDTO);
        return "showDetail";
    }
    @RequestMapping("/addPanel")
    public String addPanel(Model model){
        model.addAttribute("actionUrl" , "/student/add");
        return "add";
    }


    @RequestMapping("/update")
    public String update(StudentDTO studentDTO , Model model){
        log.info("更新信息 ： [{}]",studentDTO);
        model.addAttribute("student" , studentDTO);
        return "showDetail";
    }

    @RequestMapping("/delete")
    public String delete(Long id , Model model){
        log.info("删除的id  : [{}] " , id);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setAge("11");
        studentDTO.setPassed(false);
        studentDTO.setName("张三");
        studentDTO.setDate(new Date());
        model.addAttribute("student" , studentDTO);
        return "showDetail";
    }

}
