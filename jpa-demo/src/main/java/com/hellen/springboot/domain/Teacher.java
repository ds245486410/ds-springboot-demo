package com.hellen.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author daiweihang
 * @date 2019/6/13
 */
@Getter@Setter@ToString
@Table(name = "teacher")
@Entity
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer age;
    @CreatedDate
    private Date createAt;
    @ManyToMany
    @JoinTable(name = "student_teacher")
    private List<Student> students;
}
