package org.example.hw5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 */
public class task1 {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        countWord(str);
    }

    /**
     * Количесвто каждого слова(без занаков перпинания)
     * @param str Текст для подсчета
     */
    private static void countWord(String str) {
        String[] strArr = str.replaceAll("\\.| —", "")
                .toLowerCase()
                .split(" ");
        Map<String, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            mapStr.putIfAbsent(strArr[i], 0);
            mapStr.put(strArr[i], mapStr.get(strArr[i]) + 1);
        }
        for (var entry : mapStr.entrySet()) {
            System.out.println("Слово " + entry.getKey() + " встречалось - " + entry.getValue() + " раз");
        }
    }
}
