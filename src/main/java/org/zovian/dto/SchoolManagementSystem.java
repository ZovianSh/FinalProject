package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;

    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    public SchoolManagementSystem() {

    }

    //methods to add departments, teachers, students, ...
    public void addDepartment(String departmentName) {

    }


    public void addStudent(String fname, String lname, String studentId) {

    }

    public void addTeacher(String fname, String lname, String teacherId) {

    }

    public void addCourse(String courseName, double credit, String courseId) {

    }

    //methods to display ...
    public void printDepartments() {

    }

    public void printStudents() {

    }

    public void printTeachers() {

    }

    public void printCourses() {

    }

    //search for methods

    public Department findDepartment(String departmentId) {
        return null;
    }

    public Teacher findTeacher(String teacherId) {
        return null;
    }

    public Course findCourse(String courseId) {
        return null;
    }

    public Student findStudent(String studentId) {
        return null;
    }

    //assign teacher to a course
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    //register a student for a course
    public void registerCourse(String studentId, String courseId) {

    }

}
