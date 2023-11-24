package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Teacher {
    // private static int nextId = 1;
    private String lname;
    private String fname;
    private Department department;
    private String id;

}
