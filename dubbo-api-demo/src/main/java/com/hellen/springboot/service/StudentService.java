package com.hellen.springboot.service;

import com.hellen.springboot.dto.StudentDTO;

import java.util.List;

/**
 * @author daiweihang
 * @date 2019/4/24
 */
public interface StudentService {
    List<StudentDTO> findList();
}
