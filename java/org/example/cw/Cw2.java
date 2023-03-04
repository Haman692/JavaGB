package org.example.cw;
import java.util.Scanner;
public class Cw2 {
    public static void main(String[] args) {
//        Найти количесвто положительных чисел, после которых идут отрицательные
        Scanner cw = new Scanner(System.in);
        System.out.println("Количесвто цифр в последовательности: ");
        int number = cw.nextInt();
        int count = 0;
        int numberA = cw.nextInt();
        for (int i = 1; i < number; i++) {
            int numberB = cw.nextInt();
            if (numberA > 0 && numberB < 0) {
                count++;
            }
            numberA = numberB;
        }
        System.out.println(count);
        cw.close();
    }
}
