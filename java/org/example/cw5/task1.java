package org.example.cw5;

import java.util.HashMap;
import java.util.Map;

/**
 * Посчитать количество вхождений каждого символа в текст.
 */
public class task1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "qfdsgfdd wsgefwef wdfafdaw";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i), 1);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            if (!mapCh.containsKey(str.charAt(i))){
//                mapCh.put(str.charAt(i),1);
//            }else {
//                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            }
        }
        for (var entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " встретился - " + entry.getValue() + " раз");
        }
    }
}
