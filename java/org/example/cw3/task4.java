package org.example.cw3;

import org.example.cw3.model.Cube;

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "red", "wood");
        Cube cube2 = new Cube(3, "red", "wood");
        Cube cube3 = new Cube(3, "red", "wood");
        Cube cube4 = new Cube(1, "red", "metal");
        Cube cube5 = new Cube(2, "yellow", "paper");
        Cube cube6 = new Cube(3, "green", "paper");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);
        cubeList.add(cube6);
        System.out.println("Коллекция: " + cubeList.size());
        System.out.println("уникальная коллекция: " + unicumCollection(cubeList).size());
    }

    private static Collection<Cube> unicumCollection(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
