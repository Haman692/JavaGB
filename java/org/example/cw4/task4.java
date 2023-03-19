package org.example.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class task4 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>(Arrays.asList(1, -2, -3, 4, 5, 6, -7, 8, 9));
        System.out.println(solution(someList));
    }

    /**
     *
     * @param someList - исходный лист
     * @return удаленный отрицательные элементы
     */
    private static List<Integer> solution(LinkedList<Integer> someList) {
        for (int i = someList.size() - 1; i > 0; i--) {
            if (someList.get(i) < 0){
                someList.remove(i);
            }
        }
        return someList;
    }
}
