package org.example.hw3;

import org.example.hw3.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class task1 {
    public static void main(String[] args) {
        Product prod1 = new Product("Хлеб высший сорт", 100, 1);
        Product prod2 = new Product("Хлеб высший сорт", 75, 2);
        Product prod3 = new Product("Хлеб", 50, 3);
        Product prod4 = new Product("Молоко высший сорт", 150, 1);
        Product prod5 = new Product("Молоко", 125, 2);
        Product prod6 = new Product("Молоко", 100, 3);
        Product prod7 = new Product("Яйца ", 100, 1);
        Product prod8 = new Product("Яйца", 90, 2);
        Product prod9 = new Product("Яйца высший сорт", 80, 3);

        List<Product> productList = new ArrayList<>();
        productList.add(prod1);
        productList.add(prod2);
        productList.add(prod3);
        productList.add(prod4);
        productList.add(prod5);
        productList.add(prod6);
        productList.add(prod7);
        productList.add(prod8);
        productList.add(prod9);

        for (int i = 0; i < productList.size(); i++) {
            if (!productList.get(i).getName().contains("высший") ||
                    (productList.get(i).getGrade() != 1 &&
                            productList.get(i).getGrade() != 2)) {
                productList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < productList.size(); j++) {
                if (i != j &&
                        productList.get(i).getName().contains("высший") &&
                        productList.get(i).getName().equals(productList.get(j).getName()) &&
                        productList.get(i).getPrice() > productList.get(j).getPrice()) {
                    productList.remove(j);
                }
            }
        }
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).getName() + " цена: " + productList.get(i).getPrice());
        }
    }
}