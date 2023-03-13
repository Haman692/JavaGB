package org.example.cw3;

import org.example.cw3.model.Cube;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
 *            - количество кубиков желтого цвета и их суммарный объем;
 *            - количество деревянных кубиков с ребром 3 см
 */
public class task3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "red", "wood");
        Cube cube2 = new Cube(3, "yellow", "wood");
        Cube cube3 = new Cube(3, "green", "metal");
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

        RedCube(cubeList);
        WoodCubeRib3(cubeList);
}

    private static void WoodCubeRib3(List<Cube> cubeList) {
        int sum = 0;
        for (Cube c: cubeList) {
            if(c.getMaterial().equals("wood") && c.getRibLength() == 3){
                sum += 1;
            }
        }
        System.out.println("Wood cube = " + sum);
    }

    private static void RedCube(List<Cube> cubeList) {
        int sum = 0;
        int value = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("yellow")) {
                sum += (cube.getRibLength())*(cube.getRibLength())*(cube.getRibLength());
                value += 1;
            }
        }
        System.out.println("cube = " + value);
        System.out.println("Volume = " + sum);
    }


}
