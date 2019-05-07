package com.hellen.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Boolean passed;

    public String getPassedDesc(){
        return passed ? "是"  : "否";
    }
}
