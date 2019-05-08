package com.hellen.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author daiweihang
 * @date 2019/5/8
 */
@Getter
@Setter
@ToString
public class BaseDomain implements Serializable {
    private Integer id;
    private String createBy;
    private Date credateAt;
    private String updateBy;
    private Date updateAt;
}
