package org.example.hw3.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewProduct {
    private String name;
    private String country;
    private double weight;
    private double price;
    private int grade;
}
