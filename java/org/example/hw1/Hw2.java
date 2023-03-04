package org.example.hw1;
import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
//      Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers, to end enter 0");
        int numberA = scan.nextInt();
        int sum = 0;
        while (true){
            int numberB = scan.nextInt();
            if (numberB == 0){
                break;
            }
            if(numberB < 0 && numberA > 0){
                sum += numberA;
            }
            numberA = numberB;
        }
        System.out.println(sum);
    }
}
