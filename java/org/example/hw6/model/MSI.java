package org.example.hw6.model;

public class MSI implements Laptop {
    @Override
    public String producer() {
        return "MSI";
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public Integer ram() {
        return 16;
    }

    @Override
    public Integer storage() {
        return 512;
    }

    @Override
    public Boolean os() {
        return false;
    }

    @Override
    public Double price() {
        return 65999.0;
    }
}
