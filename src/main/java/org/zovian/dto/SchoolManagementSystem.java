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

    /**
     * Adds a new department to the system with the given department name.
     * @param departmentName name of the department
     */
    public void addDepartment(String departmentName) {

    }

    /**
     * Adds a new student to the system
     * @param fname first name of the student
     * @param lname last name of the student
     * @param departmentId the ID of the department to which the student belongs
     */
    public void addStudent(String fname, String lname, String departmentId) {

    }

    /**
     * Adds a new teacher to the system
     * @param fname first name of the teacher
     * @param lname last name of the teacher
     * @param departmentId the ID of the department to which the teacher belongs
     */
    public void addTeacher(String fname, String lname, String departmentId) {

    }

    /**
     * Adds a new course to the system.
     * @param courseName The name of the course.
     * @param credit The credit hours associated with the course.
     * @param departmentId the ID of the department to which the course belongs
     */
    public void addCourse(String courseName, double credit, String departmentId) {

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
     * @param departmentId the department ID
     * @return the Department with the specified ID, or null if not found.
     */
    public Department findDepartment(String departmentId) {
        return null;
    }

    /**
     * Searches for a teacher in the school based on the provided teacherId.
     * @param teacherId the teacher ID
     * @return he Teacher with the specified ID, or null if not found.
     */
    public Teacher findTeacher(String teacherId) {
        return null;
    }

    /**
     * Searches for a course in the school based on the provided courseId.
     * @param courseId the course ID
     * @return The Course with the specified ID, or null if not found.
     */
    public Course findCourse(String courseId) {
        return null;
    }

    /**
     * Searches for a student in the school based on the provided studentId.
     * @param studentId the student's ID
     * @return The Student with the specified ID, or null if not found.
     */
    public Student findStudent(String studentId) {
        return null;
    }

    /**
     * Assigns a teacher to a specific course based on the provided teacherId and courseId.
     * Prints a message if either the teacher or the course is not found.
     * @param teacherId the teacher's ID
     * @param courseId The ID of the course to which the teacher should be assigned.
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     *  Registers a course for a student based on the provided studentId and courseId.
     *  Checks various conditions, prints messages accordingly, and updates the student
     *  and course information if the registration is successful.
     * @param studentId the student's ID
     * @param courseId the course's ID
     */
    public void registerCourse(String studentId, String courseId) {

    }

}
