package org.example.cw6;

import java.util.*;

/**
 * Найти пересечения слов в массивах и указать их общее количество
 * Пример:
 * Mas1 = ["qwe", "asd", "qwe", "x"]
 * mas2 = ["qwe", "v"]
 * Результат:
 * qwe=3
 */
public class task3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Set<String> cross = new HashSet<>(mas1);
        List<String> mas3 = new ArrayList<>(mas1);
        mas3.addAll(mas2);
        cross.retainAll(mas2);

        Map<String, Integer> count2 = new HashMap<>();
        for (String s : cross) {
            int count = 0;
            for (String s1 : mas3) {
                if (s.equals(s1)) {
                    count++;
                    Integer itemCount = count2.get(s);
                    if (itemCount == null) {
                        itemCount = 0;
                    }
                    itemCount++;
                    count2.put(s, itemCount);
                }
            }
            System.out.println(s + " = " + count);
        }
        System.out.println(count2);
    }
}
