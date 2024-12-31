package com.dw.jpaapp.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InstructorDTO {
    private Long id;
    private String name;
    private String career;
    private List<Long> courseList = new ArrayList<>();
}
