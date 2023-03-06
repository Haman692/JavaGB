package org.example.cw2;
import java.util.Scanner;
// Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
public class Cw2 {
    public static void main(String[] args) {


    }
    public static int summ5(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int lastNum = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int currentNum =  scanner.nextInt();
            if(currentNum % 5 == 0 && n % lastNum == 1){
                sum += currentNum;
            }
            lastNum = currentNum;
        }

        return sum;
    }
}

