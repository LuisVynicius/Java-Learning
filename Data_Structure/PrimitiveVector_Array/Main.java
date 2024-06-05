package Data_Structure.PrimitiveVector_Array;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(7) + "Vector" + "-".repeat(7));

        Integer[] vector = new Integer[] {1,2,3,4,5};
        
        VectorFunctions.removeValue(vector, 5);
        VectorFunctions.updateValue(vector, 4, 50);
        VectorFunctions.readVector(vector);
        System.out.println("Number: " + VectorFunctions.returnBigger(vector));
        System.out.println("Contains: " + VectorFunctions.contains(vector, 3));

        System.out.println("-".repeat(7) + "Array" + "-".repeat(7));

        Integer[][] array = new Integer[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArraysFunctions.removeValue(array, 5);
        ArraysFunctions.updateValue(array, 4, 50);
        ArraysFunctions.readArray(array);
        System.out.println("Number: " + ArraysFunctions.returnBigger(array));
        System.out.println("Contains: " + ArraysFunctions.contains(array, 8));

    }
}