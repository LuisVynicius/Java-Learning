package algorithms.Binary_Search;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            list.add(i);
        }
        System.out.println("Result: " + binarySearch(list, 80));

    }

    public static Integer binarySearch(List<Integer> list, int value) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list.get(mid);
            if (guess == value) {
                return value;
            } else if (guess < value) {
                low = mid + 1;
            } else{
                high = mid - 1;
            } 
        }
        return -1;
    }

}
