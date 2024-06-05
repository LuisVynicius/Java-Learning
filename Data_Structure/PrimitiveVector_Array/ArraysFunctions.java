package Data_Structure.PrimitiveVector_Array;

import java.util.Objects;

public class ArraysFunctions {
    
    public static <T> void readArray(T[][] array) {
        for (T[] r : array) {
            for (T c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static <T> boolean contains(T[][] array, T value) {
        for (T[] r : array) {
            for (T c : r) {
                if (Objects.nonNull(c) && c.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> void removeValue(T[][] array, T value) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                if (Objects.nonNull(array[r][c]) && array[r][c].equals(value)) {
                    array[r][c] = null;
                }
            }
        }
    }

    public static <T> boolean updateValue(T[][] array, T value, T newValue) {
        if (contains(array, value)) {
            for (int r = 0; r < array.length; r++) {
                for (int c = 0; c < array[0].length; c++) {
                    if (Objects.nonNull(array[r][c]) && array[r][c].equals(value)) {
                        array[r][c] = newValue;
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    //Method to any Object that extends Number
    public static <T extends Number> T returnBigger(T[][] array) {
        T biggerNumber = null;
        for (T[] r : array) {
            for (T c : r) {
                if (Objects.nonNull(c) && (Objects.isNull(biggerNumber) || c.doubleValue() > biggerNumber.doubleValue())) {
                    biggerNumber = c;
                }
            }
        }
        return biggerNumber;
    }
}
