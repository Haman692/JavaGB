package org.example.hw3;


import org.example.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class task3 {
    public static void main(String[] args) {
        Book book1 = new Book("asd1","фыва", 10.0, 2010, 11);
        Book book2 = new Book("asd2","фыва", 10.0, 2000, 3);
        Book book3 = new Book("asd3","йцук", 10.0, 2000, 17);
        Book book4 = new Book("asd4","йцук", 10.0, 2009, 3);
        Book book5 = new Book("asd5","фыва", 10.0, 2011, 21);
        Book book6 = new Book("asd6","ывап", 10.0, 2012, 7);
        Book book7 = new Book("ads7","ячсм", 10.0, 2020, 22);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);

        for (int i = 0; i < books.size(); i++) {
            if(prime(books.get(i).getPages()) &&
                    books.get(i).getSurname().toUpperCase().contains("А") &&
                    books.get(i).getDate() >= 2010){
                System.out.println(books.get(i).getNameBook());
            }
        }
    }

    private static boolean prime(int pages) {
        boolean flag = true;
        for (int i = 2; i < pages; i++) {
            if (pages % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
