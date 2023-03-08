package org.example.hw2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length = ");
        int length = scanner.nextInt();
        int[] arr = createArr(length);
        System.out.println(Arrays.toString(arr));
        arr = changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr Executable array
     * @return Change array
     */
    private static int[] changeArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 10 && arr[i] < 100) || (arr[i] <= -10 && arr[i] > -100)) {
                sum += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }
        return arr;
    }

    /**
     * @param length Array length
     * @return Array
     */
    private static int[] createArr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 30) - 15);
        }
        return arr;
    }
}
