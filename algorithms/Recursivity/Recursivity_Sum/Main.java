package algorithms.Recursivity.Recursivity_Sum;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
    }

    public static int sum(int... array) {
        if (array.length == 0) {
            return 0;
        } else {
            return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
        }
    }

}
