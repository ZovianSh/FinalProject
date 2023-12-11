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
            System.out.println("new " + department + "added successfully!");
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

            if (department != null) {
                Student student = new Student(fname, lname, department);
                students[studentNum++] = student;
                System.out.println("new " + student + " added successfully!");
            }
            else{
                System.out.println("Department with id " + departmentId + " not found. Add student failed.");
            }
        }
        else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * Adds a new teacher to the system
     * @param fname the teacher's first name
     * @param lname the teacher's last name
     * @param departmentId the department id they'll be in
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherNum < MAX_TEACHER_NUM) {
            Department department = findDepartment(departmentId);

            if (department != null) { //ensure that the department is found before creating student
                Teacher teacher = new Teacher(fname, lname, department);
                teachers[teacherNum++] = teacher;
                System.out.println("new " + teacher + " added successfully!");
            }
            else {
                System.out.println("Department with id " + departmentId + " not found. Add student failed.");
            }
        }
        else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * Adds a new course to the system.
     * @param courseName the course name
     * @param departmentId the department id the course belongs to
     * @param credit the course credit
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (courseNum < MAX_COURSE_NUM) {
            Department department = findDepartment(departmentId);

            courses[courseNum] = new Course(courseName, credit, department);
            System.out.println("new " + courses[courseNum++] + " added successfully!");
        }
        else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * displays information about all departments in the school
     */
    public void printDepartments() {
        System.out.println("Displaying all departments: \n ----------------------");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * displays information about all students in the school, including their registered courses.
     */
    public void printStudents() {
        System.out.println("Displaying all students: \n ----------------------");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * displays information about all teachers in the school, including the courses they teach
     */
    public void printTeachers() {
        System.out.println("Displaying all teachers: \n ----------------------");
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * displays information about all courses in the school, including the teacher, students,
     * and department associated with each course
     */
    public void printCourses() {
        System.out.println("Displaying all courses: \n ----------------------");
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * Searches for a department in the school based on the provided department id.
     * @param departmentId the department id.
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
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * Searches for a course in the school based on the provided courseId.
     * @param courseId the course ID
     * @return The Course with the specified ID, or null if not found.
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    /**
     * Searches for a student in the school based on the provided studentId.
     * @param studentId the student's ID
     * @return The Student with the specified ID, or null if not found.
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Assigns a teacher to a specific course based on the provided teacherId and courseId.
     * Prints a message if either the teacher or the course is not found.
     * @param teacherId the teacher's ID
     * @param courseId The ID of the course to which the teacher should be assigned.
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Course course = findCourse(courseId);
        Teacher newTeacher = findTeacher(teacherId);

        if (course != null && newTeacher != null) {
            course.setTeacher(newTeacher);

            System.out.println(course + " teacher info updated successfully.");
        }
        else if (course == null) {
            System.out.println("Cannot find any course match with courseId " + courseId + ", modify teacher for course " + courseId + " failed.");
        }
        else {
            System.out.println("Cannot find any teacher match with teacherId " + teacherId + ", modify teacher for course " + courseId + " failed.");
        }
    }

    /**
     *  Registers a course for a student based on the provided studentId and courseId.
     *  Checks various conditions, prints messages accordingly, and updates the student
     *  and course information if the registration is successful.
     * @param studentId the student's ID
     * @param courseId the course's ID
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (student == null) {
            System.out.println("Cannot find any student match with studentId " + studentId +
                    ", register course for student " + studentId + " failed.");
            return;
        }

        if (course == null) {
            System.out.println("Cannot find any course match with courseId " + courseId +
                    ", register course for student " + studentId + " failed.\"");
            return;
        }

        if (student.getCourseNum() >= Student.MAX_COURSE_NUM) {
            System.out.println("Student " + studentId + " has already registered " + Student.MAX_COURSE_NUM +
                    " courses, register course for student " + studentId + " failed.");
            return;
        }

        if (course.getStudentNum() >= Course.MAX_STUDENT_NUM) {
            System.out.println("Course " + courseId + " has been fully registered, register course " + courseId +
                    " for student " + studentId + " failed.");
            return;
        }

        boolean isAlreadyRegistered = false; //Bonus: check if the student has already registered
        for (Course registeredCourse : student.getCourses()) {
            if (registeredCourse != null && registeredCourse.equals(course)) {
                isAlreadyRegistered = true;
                break;
            }
        }

        if (isAlreadyRegistered) {
            System.out.println("Student " + studentId + " has already registered Course " + courseId +
                    ", register course " + courseId + " for student " + studentId + " failed.");
            return;
        }

        if (courseNum < MAX_COURSE_NUM && studentNum < MAX_STUDENT_NUM) {
            //Add the course to the student's registered courses and ++
            student.getCourses()[student.getCourseNum()] = course;
            student.setCourseNum(student.getCourseNum() + 1);

            //Add the student to the course's registered students and ++
            course.getStudents()[course.getStudentNum()] = student;
            course.setStudentNum(course.getStudentNum() + 1);

            System.out.println("Student registered to course successfully!\n" +
                    "Latest student info: " + student +
                    "\nLatest course info: " + course);
        }
    }

}
