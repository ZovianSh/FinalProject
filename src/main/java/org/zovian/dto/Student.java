package org.zovian.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;

    private String fname;
    private String lname;
    private Course[] courses;
    private String studentId;
    private int courseNum;
    private Department department;

    public Student(String fname, String lname, Department department) {
        //S%03d
    }

    public String toString() {
        return null;
    }


}
