package org.example.hw3.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String surname;
    private double price;
    private int date;
    private int pages;
}
