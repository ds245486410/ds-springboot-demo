package com.hellen.springboot.repositories;

import com.hellen.springboot.JpaDemoApplicationTests;
import com.hellen.springboot.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

import java.util.List;

/**
 * @author daiweihang
 * @date 2019/5/14
 */
@Slf4j
public class StudentRepositoryTest extends JpaDemoApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testlistAll(){
        List<Student> studentList = studentRepository.findAll();
        for (Student student : studentList) {
            log.info("id : [{}]" , student.getId());
            log.info("name : [{}]" , student.getName());
            log.info("age : [{}]" , student.getAge());
            log.info("teacher:[{}]" , student.getTeachers());
        }
    }

    @Test
    public void testInsert(){
        Student user = new Student();
        user.setName("赵柳");
        user.setAge(14);
        Student saveResult = studentRepository.save(user);
        log.info(saveResult + "");
    }

    @Test
    public void testUpdate(){
        Student user = new Student();
        user.setName("修改2");
        user.setAge(15);
        user.setId(15L);
        Student saveResult = studentRepository.save(user);
        log.info(saveResult + "");
    }

    @Test
    public void testFindByName(){
        List<Student> students = studentRepository.findByName("修改2");
        log.info("查询结果 : [{}]" ,students);
    }

    @Test
    public void testFindAllByName(){
        List<Student> students = studentRepository.findAllByName("修改2");
        log.info(students +"" );
    }

    @Test
    public void teseDelete(){
        studentRepository.deleteById(16L);
    }

    @Test
    public void  testFindByNameAndId(){
        Student student = studentRepository.findByNameAndId("修改2", 15L);
        log.info(student +"");
    }

    @Test
    public void testFindAll(){
        int page = 1 ;
        int size =  2;
        Sort sort = new Sort(Sort.Direction.DESC , "id");
        Pageable pageQuery = new PageRequest(page , size , sort);
        Page<Student> listPage =  studentRepository.findAll(pageQuery);
        log.info(listPage.getTotalPages() +"");
        log.info(listPage.getContent() + "");

    }
}
