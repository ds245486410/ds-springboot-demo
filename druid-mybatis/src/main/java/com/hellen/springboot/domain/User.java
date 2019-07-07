package com.hellen.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
public class User {
    //姓名
    private String name;
    // 手机号
    private String phone;
    // 图片
    private String picture;
    // 性别
    private Integer sex;
    // id
    private Integer id;
    // 插入的操作人员
    private String createBy;
    // 插入的时间
    private Date credateAt;
    // 修改的操作人员
    private String updateBy;
    // 修改时间
    private Date updateAt;
}
