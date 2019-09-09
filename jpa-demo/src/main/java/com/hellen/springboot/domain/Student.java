package com.hellen.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author daiweihang
 * @date 2019/5/14
 */
@Getter@Setter@ToString
@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer age;
    @ManyToMany
    @JoinTable(name = "student_teacher",joinColumns = @JoinColumn(name = "student_id")
            ,inverseJoinColumns = @JoinColumn(name = "teacher_id") )
    private List<Teacher> teachers;
}
