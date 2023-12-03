package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * represents a course offered within the school system.
 * Each course has a unique ID, consisting of a prefixed 'C' followed by a three-digit number.
 * includes information about the course name, credit value, the department it belongs to, the teacher
 * responsible for the course, and an array of students enrolled in the course.
 */
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

    /**
     * Constructs a Course object with the specified course name, credit value, and department.
     * @param courseName the course's name
     * @param credit the credit value assigned to the course
     * @param department the department to which the course belongs
     */
    public Course(String courseName, double credit, Department department) {
        this.courseId = "C" + String.format("%03d", nextId++);
        this.courseName = courseName;
        this.department = department;
        this.credit = credit;
    }

    /**
     * Returns a string representation of the Course object.
     * @param courseName the course's name
     * @param courseId the course's ID
     * @param credit the credit value of the course
     * @param department the department the course belongs
     * @param teacher the teacher assigned to the course
     * @param students the students assigned to the course
     * @param studentNum the number of students in the course
     * @return courseName, courseId, credit, department, teacher, students, studentNum
     */

    public String toString(String courseName, String courseId, double credit, Department department, Teacher teacher, Student[] students, int studentNum) {
        return "Course{id='" + courseId + "', courseName='" + courseName + "', credit=" + credit + ", teacher=" + teacher +
                ", department='" + department + "', students=" + Arrays.toString(students) + "}";
    }
}
