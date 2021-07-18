package homework02;

import java.lang.reflect.Array;

public class testTrowable {
    public static void testException(String[][] arrays) throws MyArraySizeException, MyArrayDataException {
        int size = arrays.length;
        int summa = 0;
        if (size != 4){
            throw new MyArraySizeException();
        }
        else{
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    try {
                        summa = summa + Integer.parseInt(String.valueOf(arrays[i][j]));
                    }
                    catch (NumberFormatException exception){
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
    }
}
