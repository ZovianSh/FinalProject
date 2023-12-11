package org.zovian.dto;

import lombok.*;

import java.util.Arrays;

/**
 * Represents a student in the school system.
 * Each student has a unique ID, consisting of a prefixed 'S' followed by a three-digit number.
 * Students can be registered for a maximum number of courses (MAX_COURSE_NUM).
 */

@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class Student {
    public static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;

    private String fname;
    private String lname;
    private Course[] courses;
    private String studentId;
    private int courseNum;
    private Department department;

    /**
     * Constructs a Student object with the specified first name, last name, and department.
     * @param fname The first name of the student.
     * @param lname The last name of the student.
     * @param department The department to which the student belongs.
     */
    public Student(String fname, String lname, Department department) {
        this.studentId = "S" + String.format("%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * Returns a string representation of the Student object.
     * @return nextId, fname, lname, courses, courseNum, department
     */
    @Override
    public String toString() {
        String courseNamesStr = "[";
        for (Course course : courses) {
            if (course != null) {
                courseNamesStr += course.getCourseName() + ", ";
            }
        }
        courseNamesStr += "]";

        return "Student{id=" + getStudentId() + ", fname=" + fname + ", lname=" + lname + ", department=" + department +
                ", courseNum=" + courseNum + ", courses=" + courseNamesStr + "}";
    }
}
