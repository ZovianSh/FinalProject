package org.zovian.dto;

import lombok.*;

import java.util.Arrays;

/**
 * Represents a student in the school system.
 * Each student has a unique ID, consisting of a prefixed 'S' followed by a three-digit number.
 * Students can be registered for a maximum number of courses (MAX_COURSE_NUM).
 */
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
    }

    /**
     * Returns a string representation of the Student object.
     * @param studentId the student ID
     * @param fname the first name of the student
     * @param lname the last name of the student
     * @param courses the courses they are in
     * @param courseNum the number of courses they are in
     * @param department the department that they belong
     * @return nextId, fname, lname, courses, courseNum,department
     */
    public String toString(String studentId, String fname, String lname, Department department, int courseNum, Course[] courses) {
        return "Student{id='" + studentId + "', fname='" + fname + "', lname='" + lname + "', department=" + department +
                ", courseNum=" + courseNum + ", courses=" + Arrays.toString(courses) + "}";
    }
}
