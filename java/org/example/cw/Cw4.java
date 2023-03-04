package org.example.cw;
import java.util.Scanner;
public class Cw4 {
    public static void main(String[] args) {
        Scanner cw = new Scanner(System.in);
        System.out.println("Arr size: ");
        int arrSize = cw.nextInt();
        int[] arr = new int[arrSize];
        boolean flag = true;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = cw.nextInt();
        }
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length -1 - i]) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
