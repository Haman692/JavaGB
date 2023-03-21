package org.example.cw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Перевести число из римского написания в арабский
 */
public class task3 {
    public static void main(String[] args) {
        System.out.println(arabToRom("MCMXCIV"));
    }

    /**
     * Перевод числа
     *
     * @param romNumber римская число
     * @return арабская число
     */
    private static int arabToRom(String romNumber) {
        Map<String, Integer> numberSet = new HashMap<>();
        int number = 0;
        numberSet.put("I", 1);
        numberSet.put("V", 5);
        numberSet.put("X", 10);
        numberSet.put("L", 50);
        numberSet.put("C", 100);
        numberSet.put("D", 500);
        numberSet.put("M", 1000);
        String[] numberArr = romNumber.split("");
        for (int i = 0; i < numberArr.length; i++) {
            if (i != numberArr.length - 1 && numberSet.get(numberArr[i]) < numberSet.get(numberArr[i + 1])) {
                number -= numberSet.get(numberArr[i]);
            } else {
                number += numberSet.get(numberArr[i]);
            }
        }
        return number;
    }
}
