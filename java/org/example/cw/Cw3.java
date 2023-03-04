package org.example.cw;
import java.util.Scanner;
public class Cw3 {
    public static void main(String[] args) {
        Scanner cw = new Scanner(System.in);
        System.out.println("Введите строчку: ");
        String msg = cw.nextLine();
        String sub1 = msg.substring(0, msg.length()/2);
        String sub2 = msg.substring(msg.length()/2);
        System.out.println(sub2+sub1);
    }
}
