package org.zovian;

import org.zovian.dto.*;

/**
 * @author Zovian Shagdjian
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem smSystem = new SchoolManagementSystem();

        //add to the system
        smSystem.addDepartment("Computer Science");
        smSystem.addStudent("Zovian", "Shagdjian", "D001");
        smSystem.addTeacher("Blah", "Blahbian", "D001");
        smSystem.addCourse("Humanities", 3, "D001");

        //display items in the system
        smSystem.printDepartments();
        smSystem.printStudents();
        smSystem.printTeachers();
        smSystem.printCourses();

        //search for an item in system
        System.out.println(smSystem.findDepartment("D001"));
        System.out.println(smSystem.findStudent("S001"));
        System.out.println(smSystem.findTeacher("T001"));
        System.out.println(smSystem.findCourse("C001"));

        //modify the teacher of a course
        smSystem.modifyCourseTeacher("T001", "C001");

        //register a student to a course
        smSystem.registerCourse("S001", "C001");
        smSystem.registerCourse("S001", "C001");




    }
}