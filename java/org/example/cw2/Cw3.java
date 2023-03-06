package org.example.cw2;

/**
 * Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше
  */
public class Cw3 {
    public static void main(String[] args) {
        System.out.println(solution(new int [] {1,2,5,7,3,9,4,2,1}));
    }

    public static int solution(int[] arr){
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] == arr[i] * 2){
                count++;
            }
        }
        return count;
    }
}
