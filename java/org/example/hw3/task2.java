package org.example.hw3;

import org.example.hw3.model.NewProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class task2 {
    public static void main(String[] args) {
        NewProduct prod1 = new NewProduct("Хлеб", "Россия", 300, 100, 1);
        NewProduct prod2 = new NewProduct("Хлеб", "Казахстан", 300, 110, 1);
        NewProduct prod3 = new NewProduct("Молоко", "Россия", 300, 100, 2);
        NewProduct prod4 = new NewProduct("Молоко", "Россия", 300, 100, 3);
        NewProduct prod5 = new NewProduct("Рыба", "Россия", 300, 100, 3);
        NewProduct prod6 = new NewProduct("Яйца", "Россия", 300, 100, 1);

        List<NewProduct> listProduct = new ArrayList<>();
        listProduct.add(prod1);
        listProduct.add(prod2);
        listProduct.add(prod3);
        listProduct.add(prod4);
        listProduct.add(prod5);
        listProduct.add(prod6);

        Scanner scan = new Scanner(System.in);
        System.out.println("Сорт: ");
        int searchGrade = scan.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getGrade() != searchGrade){
                listProduct.remove(i);
                i--;
            }
        }
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = 0; j < listProduct.size(); j++) {
                if(i!=j &&
                        listProduct.get(i).getName().equals(listProduct.get(j).getName()) &&
                        listProduct.get(i).getPrice() < listProduct.get(j).getPrice()) {
                    listProduct.remove(j);
                }
            }
        }
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).getName() + " с мин ценой: " + listProduct.get(i).getPrice());
        }
    }
}
