package org.example.hw6.model;

public class Ilbrus implements Laptop {
    @Override
    public String producer() {
        return "Ilbrus";
    }

    @Override
    public String color() {
        return "white";
    }

    @Override
    public Integer ram() {
        return 8;
    }

    @Override
    public Integer storage() {
        return 128;
    }

    @Override
    public Boolean os() {
        return true;
    }

    @Override
    public Double price() {
        return 17899.0;
    }
}
