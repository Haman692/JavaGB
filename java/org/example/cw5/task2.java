package org.example.cw5;


import java.util.HashMap;
import java.util.Map;

/**
 * Определить, есть ли в масиве дубликаты, если найден хоть один, вывести на экран(true),
 * В противном случае (false).
 */
public class task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,5,6,2};
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(searchDuble2(arr));
        System.out.println(searchDuble2(arr2));
    }

    /**
     * Поиск дубликато
     * @param arr - исходный масив
     * @return true or false
     */
    private static boolean searchDuble(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                return true;
            }else {
                map.put(arr[i], 1);
            }
        }
        return false;
    }

    /**
     * Поиск дубликато
     * @param arr - исходный масив
     * @return true or false
     */
    private static boolean searchDuble2(int[] arr){
        Map<Integer,Integer> testMass = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            testMass.put(arr[i], 1);
        }
        return (testMass.size() == arr.length);
    }
}
