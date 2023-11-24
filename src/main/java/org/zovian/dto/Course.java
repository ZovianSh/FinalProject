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
    private static final int MAX_STUDENT_NUM = 5;
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName) {

    }

    public void addStudent(Student student){

    }

    public void addTeacher(Teacher teacher) {

    }

}
