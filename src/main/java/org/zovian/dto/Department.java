package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a department within the school system.
 * Each department has a unique ID, consisting of a prefixed 'D' followed by a three-digit number.
 * It also contains a name that describes the department to which the course belongs to.
 */
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private static int nextId = 1;
    private String departmentId;
    private String departmentName;

    /**
     * Constructs a Department object with the specified department name.
     * @param departmentName The name that describes the department.
     */
    public Department(String departmentName) {
        //D%03d
    }

    /**
     * Returns a string representation of the Department object.
     * @param departmentName the departments name
     * @param departmentId the department ID
     * @return departmentName, departmentId
     */
    public String toString(String departmentName, String departmentId) {
        return null;
    }
}
