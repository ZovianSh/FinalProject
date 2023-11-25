package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private static int nextId = 1;
    private String departmentId;
    private String departmentName;

    public Department(String departmentName) {
        //D%03d
    }

    @Override
    public String toString() {
        return null;
    }
}
