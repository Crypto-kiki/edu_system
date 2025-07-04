// src/main/java/com.baekki.edu_system/model/Teacher
package com.baekki.edu_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    private Integer id;
    private String name;
}
