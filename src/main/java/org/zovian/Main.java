package org.zovian;

import org.zovian.dto.*;

/**
 * @author Zovian Shagdjian
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem smSystem = new SchoolManagementSystem();

        smSystem.addDepartment("Computer Science");
        smSystem.addDepartment("Math");

        smSystem.addStudent("Zovian", "Shagdjian", "DOO1");
    }
}