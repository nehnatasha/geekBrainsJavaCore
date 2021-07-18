package homework02;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
//        //корекктное выполнение программы
//        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
//        try {
//            testTrowable.testException(arr);
//        } catch (MyArraySizeException | MyArrayDataException e) {
//            e.printStackTrace();
//        }
//
        //некорретная размерность массива
        String[][] arr1 = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            testTrowable.testException(arr1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
//        //некорректный формат элемента массива
//        String[][] arr2 = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3--"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
//        try {
//            testTrowable.testException(arr2);
//        } catch (MyArraySizeException | MyArrayDataException e) {
//            e.printStackTrace();
//        }
    }
}
