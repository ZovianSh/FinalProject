package org.zovian.dto;

import lombok.*;


/**
 * represents a course offered within the school system.
 * Each course has a unique ID, consisting of a prefixed 'C' followed by a three-digit number.
 * includes information about the course name, credit value, the department it belongs to, the teacher
 * responsible for the course, and an array of students enrolled in the course.
 */
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class Course {
    public static final int MAX_STUDENT_NUM = 5;
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
        this.students = new Student[MAX_STUDENT_NUM];
    }

    /**
     * Returns a string representation of the Course object.
     * @return courseName, courseId, credit, department, teacher, students, studentNum
     */
    @Override
    public String toString() {
        String teacherName = (teacher != null) ? teacher.getFname() + " " + teacher.getLname() : "null";

        String studentNamesStr = "[";
        for (Student student : students) {
            if (student != null) {
                studentNamesStr += student.getFname() + " " + student.getLname() + ", ";
            }
        }
        studentNamesStr += "]";

        return "Course{id=" + courseId + ", courseName=" + courseName + ", credit=" + credit + ", teacher=" +
                teacherName + ", department=" + department.getDepartmentName() +
                ", students=" + studentNamesStr + "}";
    }
}
