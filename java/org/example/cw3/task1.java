package org.example.cw3;

import org.example.cw3.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
 * Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
 */
public class task1 {
    public static void main(String[] args) {
        Items items = new Items("qwe", "zxc", 3.0);
        Items items1 = new Items("qwe1", "asd", 3.0);
        Items items2 = new Items("qwe", "ert", 3.0);
        Items items3 = new Items("qwe3", "dfc", 3.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)){
                sumVolume+=itemsList.get(i).getVolume();
                country.add(itemsList.get(i).getCountry());
            }
        }
        System.out.println("sum = " + sumVolume);
        System.out.println("country = " + country);
    }
}
