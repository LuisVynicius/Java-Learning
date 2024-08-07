package algorithms.Sort.Selection_Sort;

public class Main {
    
    public static void main(String[] args) {
        int[] array = {9,1,2,7,3,6,8};
        selectSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
