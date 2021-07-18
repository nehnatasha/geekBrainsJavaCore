package homework02;

public class MyArrayDataException extends Exception{
    public int i;
    public int j;
    public String msg;
    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
        System.out.println("Ошибка в элементе а[" + i + "][" + j + "]");
    }
}
