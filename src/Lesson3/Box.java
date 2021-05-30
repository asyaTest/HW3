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

import java.applet.Applet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> items;
    private String weight;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.items.addAll(Arrays.asList(items));
    }

    private static Object Orange;
    public Float getWeight;

    public void add() {
    }

    public void info() {
    }

    public Float getWeight() {
        return getOrangeWeigth(getWeight);
    }

    public boolean compare(Box appleBox) {
        return false;
    }

    public void moveAt(Box orangeBox2) {
    }

    public static void main(String[] args) {

        Orange orange = new Orange(1.5f,"Orange");
        Box orangeBox = new Box();
        Box orangeBox2 = new Box();
        Box orangeBox3 = new Box();

        for (int i = 0; i < 4; i++) {
            orangeBox.add(new Orange(3.5f,"Orange"));
        }
        Apple apple = new Apple(1.0f, "Apple");
        Box appleBox = new Box();
        Box appleBox2 = new Box();
        Box appleBox3 = new Box();
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple(3.0f, "Apple"));
        }


        orangeBox.info();
        appleBox.info();

        Float orangeWeigth = orangeBox.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки с апельсинами: " + orange.weight);
        System.out.println("Вес коробки с яблоками: " + apple.weight);

        System.out.println(orangeBox.compare(appleBox));

        orangeBox.info();
        appleBox.info();
    }

    private static Float getOrangeWeigth(Float orangeWeigth) {
        return orangeWeigth;
    }

    private void add(Apple apple) {
    }

    private void add(Orange orange) {
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}