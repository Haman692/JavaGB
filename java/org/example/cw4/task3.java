package org.example.cw4;

import java.util.Arrays;
import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : integerLinkedList) {
            if (el%2 != 0){
                sum += el;
            }
        }
        for (int i = 0; i < integerLinkedList.size(); i++) {


            if(integerLinkedList.get(i)% 3 != 0){
                integerLinkedList.set(i, sum);
            }
        }
        System.out.println(integerLinkedList);
    }
}
