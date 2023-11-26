package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a teacher in the school system.
 * Each teacher has their unique ID, consisting of a prefixed 'T' followed by a three-digit number.
 * and each being associated with a specific department
 */
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Teacher {
    private static int nextId = 1;

    private String lname;
    private String fname;
    private Department department;
    private String teacherId;

    /**
     * Constructs a Teacher object with the specified first name, last name and department
     * @param fname the first name of the teacher
     * @param lname the last name of the teacher
     * @param department the department to which the teacher belongs
     */
    public Teacher(String fname, String lname, Department department) {
        //T%03d
    }

    /**
     * Returns a string representation of the Teacher object.
     * @param fname the teacher's first name
     * @param lname the teacher's last name
     * @param teacherId the teacher's ID
     * @param department the department the teacher belongs
     * @return fname, lname, teacherId, department
     */
    public String toString(String fname, String lname, String teacherId, Department department) {
        return null;//the teachers info
    }

}
