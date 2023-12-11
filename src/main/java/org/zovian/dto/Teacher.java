package org.zovian.dto;

import lombok.*;

/**
 * Represents a teacher in the school system.
 * Each teacher has their unique ID, consisting of a prefixed T followed by a three-digit number.
 * and each being associated with a specific department
 */

@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
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
        this.teacherId = "T" + String.format("%03d", nextId++);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    /**
     * Returns a string representation of the Teacher object.
     * @return fname, lname, teacherId, department
     */
    @Override
    public String toString() {
        return "Teacher{id=" + teacherId + ", fname=" + fname + ", lname=" + lname +
                ", department=" + department.getDepartmentName() + "}";
    }

}
