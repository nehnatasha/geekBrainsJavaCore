package homework03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1 - менять местами два элемента массива
        String[] arr = {"asd", "ds", "ret", "123"};
        //Integer[] arr = {3, 4, 6, 234, -1324, 111};
        moveElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        //Задача 2 - про фрукты
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.addFruits(new Orange());
        orangeBox1.addFruits(new Orange());
        orangeBox1.addFruits(new Orange());
        orangeBox2.addFruits(new Orange());
        orangeBox2.addFruits(new Orange());
        appleBox.addFruits(new Apple());
        appleBox.addFruits(new Apple());
        appleBox.addFruits(new Apple());


        orangeBox1.infoAboutBox();
        orangeBox2.infoAboutBox();
        appleBox.infoAboutBox();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки №1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки №2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAtAnotherBox(orangeBox2);
        orangeBox1.infoAboutBox();
        orangeBox2.infoAboutBox();
        appleBox.infoAboutBox();
    }

    private static <T> void moveElements(T[] array, int index1, int index2) {
        T x = array[index1];
        array[index1] = array[index2];
        array[index2] = x;
    }
}