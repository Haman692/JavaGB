package org.example.cw6.model;

public class Farenhait  implements Converter{
    @Override
    public Double convert(Double inputValue) {
        return inputValue * 9/5 + 32;
    }
}
