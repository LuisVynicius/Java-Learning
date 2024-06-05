package Data_Structure.PrimitiveVector_Array;

import java.util.Objects;

public class VectorFunctions {
    
    public static <T> void readVector(T[] vector) {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (T v : vector) {
            string.append(v + ", ");
        }
        string.substring(0, string.length()-2);
        System.out.println(string.substring(0, string.length()-2) + "]");
    }

    //Method to any Object that extends Number
    public static <T extends Number> T returnBigger(T[] vector) {
        T biggerNumber = null;
        for (T number : vector) {
            if (Objects.nonNull(number) && (Objects.isNull(biggerNumber) || number.doubleValue() > biggerNumber.doubleValue())) {
                biggerNumber = number;
            }
        }
        return biggerNumber;
    }

    public static <T> void removeValue(T[] vector, T value) {
        for (int i = 0; i < vector.length; i++) {
            if (Objects.nonNull(vector[i]) && vector[i].equals(value)) {
                vector[i] = null;
            }
        }
    }

    // It works with any class that implements the hashCode() and equals() methods
    public static <T> boolean contains(T[] vector, T value) {
        for (T v : vector) {
            if (Objects.nonNull(v) && v.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean updateValue(T[] vector, T value, T newValue) {
        if (contains(vector, value)) {
            for (int i=0; i < vector.length; i++) {
                if (Objects.nonNull(vector[i]) && vector[i].equals(value)) {
                    vector[i] = newValue;
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
