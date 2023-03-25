package org.example.cw6;

import java.util.*;

/**
 * Посчитать процент уникальных чисел
 */
public class task1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1));
        Set<Integer> set = new HashSet<>(array);
        double pr = set.size() * 100 / array.size();
        System.out.println("% = " + pr);
    }
}
