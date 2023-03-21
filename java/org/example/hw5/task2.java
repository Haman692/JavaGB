package org.example.hw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String findWord = scan.nextLine().toLowerCase();
        System.out.println("Слово " + findWord + " встретилось - " + countWord(str, findWord) + " раз");
    }

    /**
     * Количество искомого слова
     * @param str Текст для поиска
     * @param findWord Искомое слово
     * @return Количество потворений искомого слова
     */
    private static Object countWord(String str, String findWord) {
        String[] strArr = str.replaceAll("\\.| —", "")
                .toLowerCase()
                .split(" ");
        Map<String, Integer> mapWord = new HashMap<>();
        mapWord.put(findWord, 0);
        for (String s : strArr) {
            if (s.equals(findWord)) {
                mapWord.put(findWord, mapWord.get(findWord) + 1);
            }
        }
        return mapWord.get(findWord);
    }
}
