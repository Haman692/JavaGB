package org.example.hw2;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4};
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Массив восходящий");
        } else {
            System.out.println("Массив не восходящий");
        }
    }
}
