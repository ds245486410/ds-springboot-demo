package com.hellen.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author daiweihang
 * @date 2019/4/24
 */
@Getter@Setter@ToString
public class StudentDTO implements Serializable {
    private Long id;
    private String name;
    private String age;
    private Date date;
    private Boolean passed;
}
