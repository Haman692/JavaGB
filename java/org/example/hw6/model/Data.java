package org.example.hw6.model;

import java.util.*;

public class Data {

    /**
     * Sorted choice
     *
     * @return Sorted Map
     */
    public static Map<String, String> choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите количесвто критерия для соритровки:
                1. Производитель
                2. Цвет
                3. Оперативная память
                4. Объем жесткого диска
                5. Наличие операционной системы
                6. Цена
                """);
        int countChoice = scanner.nextInt();
        Map<String, String> allSorted = new HashMap<>();
        for (int i = 0; i < countChoice; i++) {
            System.out.print("\033[H\033[2J");
            System.out.println("""
                    Введите номер критерия для сортировки:
                    1. Производитель
                    2. Цвет
                    3. Оперативная память
                    4. Объем жесткого диска
                    5. Наличие операционной системы
                    6. Цена
                    """);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("""
                        Введите номер производителя :
                        1.MSI
                        2.Ilbrus
                        3.Apple""");
                int flag = scanner.nextInt();
                if (flag == 1) {
                    allSorted.put("name", "MSI");
                } else if (flag == 2) {
                    allSorted.put("name", "Ilbrus");
                } else if (flag == 3) {
                    allSorted.put("name", "Apple");
                }
            } else if (choice == 2) {
                System.out.println("""
                        Введите номер цвета :
                        1.white
                        2.black""");
                int flag = scanner.nextInt();
                if (flag == 1) {
                    allSorted.put("color", "white");
                } else if (flag == 2) {
                    allSorted.put("color", "black");
                }
            } else if (choice == 3) {
                System.out.println("Введите минимальное значение оперативной памяти: ");
                int min = scanner.nextInt();
                allSorted.put("ram", String.valueOf(min));
            } else if (choice == 4) {
                System.out.println("Введите минимальное значение объема жесткого диска:");
                int min = scanner.nextInt();
                allSorted.put("storage", String.valueOf(min));
            } else if (choice == 5) {
                System.out.println("""
                        Наличие операционной системы:
                        1.Да
                        2.Нет""");
                int flag = scanner.nextInt();
                if (flag == 1) {
                    allSorted.put("os", "true");
                } else if (flag == 2) {
                    allSorted.put("os", "false");
                }
            } else if (choice == 6) {
                System.out.println("Введите максимальную цену: ");
                int max = scanner.nextInt();
                allSorted.put("price", String.valueOf(max));
            }
        }
        return allSorted;
    }


    /**
     * Сортировка
     * @param laptops Изначальный список
     * @param choice Список сортировки
     * @return Отсортированный список
     */
    public static List<Laptop> suitableOptions(List<Laptop> laptops, Map<String, String> choice) {
        List<Laptop> sortedList = new ArrayList<Laptop>(laptops);
        for (Laptop laptop : laptops) {
            for (int j = 0; j < sortedList.size(); j++) {
                if (laptop == sortedList.get(j)) {
                    if (choice.containsKey("name") && !laptop.producer().equals(choice.get("name"))) {
                        sortedList.remove(j);
                        break;
                    }
                    if (choice.containsKey("color") && !laptop.color().equals(choice.get("color"))) {
                        sortedList.remove(j);
                        break;
                    }
                    if (choice.containsKey("ram") && laptop.ram() <= Integer.parseInt(choice.get("ram"))) {
                        sortedList.remove(j);
                        break;
                    }
                    if (choice.containsKey("storage") && laptop.storage() <= Integer.parseInt(choice.get("storage"))) {
                        sortedList.remove(j);
                        break;
                    }
                    if (choice.containsKey("os") && !laptop.os() == Boolean.getBoolean(choice.get("os"))) {
                        sortedList.remove(j);
                        break;
                    }
                    if (choice.containsKey("price") && laptop.price() >= Double.parseDouble(choice.get("price"))) {
                        sortedList.remove(j);
                        break;
                    }
                }
            }
        }
        return sortedList;
    }

}

