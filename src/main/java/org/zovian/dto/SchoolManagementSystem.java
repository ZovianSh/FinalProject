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

    private int departmentNum= 0;
    private int studentNum= 0;
    private int teacherNum= 0;
    private int courseNum= 0;

    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    /**
     * constructs a new SchoolManagementSystem with empty lists for departments, teachers,students and courses
     */
    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * Adds a new department to the system
     * @param departmentName the name given to the new department
     */
    public void addDepartment(String departmentName) {
        if (departmentNum < MAX_DEPARTMENT_NUM) {
            Department department = new Department(departmentName);
            departments[departmentNum++] = department;
            System.out.println("new " + department.toString(departmentName, department.getDepartmentId()) + "added successfully!");
        }
        else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * Adds a new student in the system
     * @param fname the student's first name
     * @param lname the student's last name
     * @param departmentId the department id they'll be in
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (studentNum < MAX_STUDENT_NUM) {
            Department department = findDepartment(departmentId);

            Student student = new Student(fname, lname, department);
            students[studentNum++] = student;
            System.out.println("new " + student.toString(student.getStudentId(), fname, lname, department, 0, new Course[0]) + " added successfully!");
        }
        else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * Adds a new teacher to the system
     * @param teacher the teacher needed to be added
     */
    public void addTeacher(Teacher teacher) {
        if (teacherNum < MAX_TEACHER_NUM) {
            teachers[teacherNum] = teacher;
            System.out.println( "new " + teacher + " added successfully!");
        }
        else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * Adds a new course to the system.
     * @param course the course needed to be added
     */
    public void addCourse(Course course) {
        if (courseNum < MAX_COURSE_NUM) {
            courses[courseNum] = course;
            System.out.println( "new " + course + " added successfully");
        }
        else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * displays information about all departments in the school
     */
    public void printDepartments() {
        System.out.println("Displaying all departments:");
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    /**
     * displays information about all students in the school, including their registered courses.
     */
    public void printStudents() {
        System.out.println("Displaying all students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * displays information about all teachers in the school, including the courses they teach
     */
    public void printTeachers() {
        System.out.println("Displaying all teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    /**
     * displays information about all courses in the school, including the teacher, students,
     * and department associated with each course
     */
    public void printCourses() {
        System.out.println("Displaying all courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    /**
     * Searches for a department in the school based on the provided department Id.
     * @param departmentId the department Id.
     * @return the Department with the id and name.
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
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
