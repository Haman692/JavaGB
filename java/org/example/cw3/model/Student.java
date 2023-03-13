package org.example.cw3.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private double scholarship;
    private List<Integer> evaluation;

}
