package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private double credit;
    private String id;
    private Student[] students; //MAX NUM
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

}
