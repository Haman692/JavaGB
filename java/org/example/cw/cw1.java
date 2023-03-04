package org.example.cw;
import java.util.Scanner;
import java.util.Arrays;
public class cw1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt();
        System.out.println(productMultMinusSum(number));
        iScanner.close();
    }
    public static int productMultMinusSum(int n){
        int mult = 1;
        int sum = 0;
        while (n != 0) {
            mult *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return mult - sum;
    }
}
