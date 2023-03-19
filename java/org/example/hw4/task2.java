package org.example.hw4;
import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        String text1 = "()";
        String text2 = "()[]{}";
        String text3 = "[({(())}[()]))]";

        System.out.println(isValid(text3));
    }

    /**
     * Valid Parentheses
     * @param s Исходная строка
     * @return Valid
     */
    private static boolean isValid(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();

        if (length %2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else if (!stack.empty() && arr[i] == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (!stack.empty() && arr[i] == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (!stack.empty() && arr[i] == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}