package org.example.hw1;
import java.util.Scanner;
public class Hw3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int numberA = scan.nextInt();
        System.out.println("enter second number");
        int numberB = scan.nextInt();
        StringBuilder sum = new StringBuilder();
        int memory = 0;
        while (numberA != 0 || numberB != 0) {
            if (numberA % 10 + numberB % 10 + memory == 0) {
                sum.insert(0, "0");
                memory = 0;
            } else if (numberA % 10 + numberB % 10 + memory == 1) {
                sum.insert(0, "1");
                memory = 0;
            } else if (numberA % 10 + numberB % 10 + memory == 2) {
                sum.insert(0, "0");
                memory = 1;
            } else if (numberA % 10 + numberB % 10 + memory == 3) {
                sum.insert(0, "1");
                memory = 1;
            }
            numberA /= 10;
            numberB /= 10;
        }
        if(memory == 1) {
            System.out.println(memory + sum.toString());
        }
        else {
            System.out.println(sum);
        }

    }
}
