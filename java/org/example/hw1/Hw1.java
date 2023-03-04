package org.example.hw1;
import java.util.Scanner;
public class Hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String msg = scan.nextLine();
        msg = ReversStr(msg);
        System.out.println(msg);
    }

    public static String ReversStr(String str) {
        str = str.replaceAll("\\s+", " ");
        String[] word1 = str.split(" ");
        String[] word2 = new String[word1.length];
        for (int i = 0; i < word1.length; i++) {
            if(word1[i] != " "){
                word2[i] = word1[word1.length - 1 - i];
            }
        }
        return String.join(" ", word2);
    }
}