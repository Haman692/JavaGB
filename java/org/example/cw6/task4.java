package org.example.cw6;


import org.example.cw6.model.Celsius;
import org.example.cw6.model.Farenhait;
import org.example.cw6.model.Kelvin;

/**
 * Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгецты. У классов наследников необходимо переопределить метод интерфейса, для валидного перевода велечин.
 * Метод для конвертации назовите "convertValue"
 */
public class task4 {
    public static void main(String[] args) {
        Double tCelsius = 100.0;
        Double tFar = new Farenhait().convert(tCelsius);
        System.out.println(tFar);
        Double tKel = new Kelvin().convert(tCelsius);
        System.out.println(tKel);
        Double tCel = new Celsius().convert(tCelsius);
        System.out.println(tCel);
    }
}
