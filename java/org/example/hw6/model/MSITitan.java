package org.example.hw6.model;

public class MSITitan implements Laptop{
    @Override
    public String producer() {
        return "MSI";
    }

    @Override
    public String color() {
        return "balck";
    }

    @Override
    public Integer ram() {
        return 32;
    }

    @Override
    public Integer storage() {
        return 2000;
    }

    @Override
    public Boolean os() {
        return true;
    }

    @Override
    public Double price() {
        return 47999.0;
    }
}
