package com.hellen.springboot.stream;


import com.hellen.springboot.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.function.Predicate;

/**
 * 只要有一个条件匹配即可满足
 */
@Slf4j
public class AnyMatch extends StreamTest {
    @Test
    public void test(){
        boolean result = stream.anyMatch(new Predicate<StudentDTO>() {
            @Override
            public boolean test(StudentDTO studentDTO) {

                return "张三".equals(studentDTO.getName());
            }
        });
        System.out.println(result);
    }
}
