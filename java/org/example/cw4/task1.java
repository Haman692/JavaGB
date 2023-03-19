package org.example.cw4;

import java.util.Deque;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            integerLinkedList.add(i);
        }
        System.out.println("peek = " + integerLinkedList.peek());
        System.out.println(integerLinkedList);
        System.out.println("pop = " + integerLinkedList.pop());
        System.out.println(integerLinkedList);
        integerLinkedList.addFirst(3);
        System.out.println("add First " + integerLinkedList);
        integerLinkedList.addLast(7);
        System.out.println("add Last " + integerLinkedList);
        integerLinkedList.remove((Integer) 3);
        System.out.println("Remove " + integerLinkedList);
        System.out.println(integerLinkedList.contains(2));

        String text1 = "/home/";
        String text2 = "/../";
        String text3 = "/home//foo/";
        System.out.println("1 = " + simplifyPath(text1));
        System.out.println("2 = " + simplifyPath(text2));
        System.out.println("3 = " + simplifyPath(text3));

    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) continue;
            else if (arr[i].equals("..")) {
                if(!list.isEmpty()) list.removeLast();
            } else list.add(arr[i]);
        }

        return "/" + String.join("/", list);
    }
}
