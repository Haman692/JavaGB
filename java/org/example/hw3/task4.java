package org.example.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Длинна масива: ");
        int size = scanner.nextInt();
        int[] array = createArr(size);
        int k = array.length;
        permutation(array, k);
    }

    public static void permutation(int[] array, int k) {
        if (k == 1) {
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = 0; i < k; i++) {
            permutation(array, k - 1);
            if (k % 2 == 0) {
                swap(array,i,k);
            } else {
                swap(array,0,k);
            }
        }
    }
    private static int[] createArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    private static void swap(int[] array, int i, int k) {
        int temp = array[i];
        array[i] = array[k - 1];
        array[k - 1] = temp;
    }
}
