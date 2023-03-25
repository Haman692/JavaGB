package org.example.hw6.model;

public class AppleMacBookPro implements Laptop{
    @Override
    public String producer() {
        return "Apple";
    }

    @Override
    public String color() {
        return "silver";
    }

    @Override
    public Integer ram() {
        return 32;
    }

    @Override
    public Integer storage() {
        return 1000;
    }

    @Override
    public Boolean os() {
        return true;
    }

    @Override
    public Double price() {
        return 362999.0;
    }
}
