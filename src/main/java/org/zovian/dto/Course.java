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
    private static final int MAX_TEACHER_NUM = 1;
    private static int nextId = 1;

    private double credit;
    private String courseId;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        //C%03d
    }

    @Override
    public String toString() {
        return null;
    }

}
