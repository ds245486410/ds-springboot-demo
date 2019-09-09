package com.hellen.springboot.repositories;

import com.hellen.springboot.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author daiweihang
 * @date 2019/5/14
 */
public interface StudentRepository extends JpaRepository<Student , Long> {
    /**
     * 根据名称查找
     * @param name
     * @return
     */
    List<Student> findByName(String name);

    List<Student> findAllByName(String name);

    Student findByNameAndId(String name, Long id);
}
