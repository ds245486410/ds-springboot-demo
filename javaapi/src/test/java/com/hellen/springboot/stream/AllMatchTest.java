package com.hellen.springboot.stream;


import com.hellen.springboot.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Predicate;

/**
 * allMatch必须全部都匹配才能满足
 */
@Slf4j
public class AllMatchTest extends StreamTest {
    @Test
    public void test(){
        ArrayList<StudentDTO> list = new ArrayList<>();


        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setName("张三");
        studentDTO.setAge("11");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(false);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(2L);
        studentDTO.setName("王五");
        studentDTO.setAge("18");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(true);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(2L);
        studentDTO.setName("赵六");
        studentDTO.setAge("18");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(true);
        list.add(studentDTO);

        stream = list.stream();


        boolean result = stream.allMatch(new Predicate<StudentDTO>() {
            @Override
            public boolean test(StudentDTO studentDTO) {
                return "张三".equals(studentDTO.getName())|| "王五".equals(studentDTO.getName());
            }
        });
        System.out.println(result);
    }
}
