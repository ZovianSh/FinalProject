package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * manages departments, students, teachers and courses within a school
 */
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

    /**
     * constructs a new SchoolManagementSystem with empty lists for departments, teachers,students and courses
     */
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

    /**
     * displays information about all departments in the school
     */
    public void printDepartments() {

    }

    /**
     * displays information about all students in the school, including their registered courses.
     */
    public void printStudents() {

    }

    /**
     * displays information about all teachers in the school, including the courses they teach
     */
    public void printTeachers() {

    }

    /**
     * displays information about all courses in the school, including the teacher, students,
     * and department associated with each course
     */
    public void printCourses() {

    }

    /**
     * Searches for a department in the school based on the provided departmentId.
     * @param departmentId
     * @return the Department with the specified ID, or null if not found.
     */
    public Department findDepartment(String departmentId) {
        return null;
    }

    /**
     * Searches for a teacher in the school based on the provided teacherId.
     * @param teacherId
     * @return he Teacher with the specified ID, or null if not found.
     */
    public Teacher findTeacher(String teacherId) {
        return null;
    }

    /**
     * Searches for a course in the school based on the provided courseId.
     * @param courseId
     * @return The Course with the specified ID, or null if not found.
     */
    public Course findCourse(String courseId) {
        return null;
    }

    /**
     * Searches for a student in the school based on the provided studentId.
     * @param studentId
     * @return The Student with the specified ID, or null if not found.
     */
    public Student findStudent(String studentId) {
        return null;
    }

    /**
     * Assigns a teacher to a specific course based on the provided teacherId and courseId.
     * Prints a message if either the teacher or the course is not found.
     * @param teacherId
     * @param courseId The ID of the course to which the teacher should be assigned.
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     *  Registers a course for a student based on the provided studentId and courseId.
     *  Checks various conditions, prints messages accordingly, and updates the student
     *  and course information if the registration is successful.
     * @param studentId
     * @param courseId
     */
    public void registerCourse(String studentId, String courseId) {

    }

}
