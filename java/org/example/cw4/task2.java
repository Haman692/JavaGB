package org.example.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : integerLinkedList) {
            if (el%2 ==0){
                sum += el;
            }
        }
        System.out.println(sum);
    }
}
