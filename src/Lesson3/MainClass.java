package Lesson3;
/*
* Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
* Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку
нельзя сложить и яблоки, и апельсины;
* Для хранения фруктов внутри коробки можно использовать ArrayList;
* Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
* Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
* Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
* Не забываем про метод добавления фрукта в коробку.**
 */

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
     /*
     1) Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
      */

        /* int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >0) {
                System.out.println("0" + " | ");
            } else if (arr1[i] < 1) {
                System.out.println("1" + " | ");
            }
        }
         */

        String[] arr1 = {"Apple", "Orange"};
        String[] arr2 = {"Orange", "Apple"};
        System.out.println(Arrays.toString(arr1));
        swapElements(arr1, arr2);
        System.out.println(Arrays.toString(arr2));

    }

    private static void swapElements(String[] arr1, String[] arr2) {

    }

    private static void swapElements(String[] arr) {
    }
}