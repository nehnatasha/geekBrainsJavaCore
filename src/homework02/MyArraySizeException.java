package homework02;

public class MyArraySizeException extends Exception {
    MyArraySizeException() {
        System.out.println("Массив имеет неверную размерность. Требуемая размерность - 4*4");
    }
}

