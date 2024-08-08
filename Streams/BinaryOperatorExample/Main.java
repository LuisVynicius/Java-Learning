package Streams.BinaryOperatorExample;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Transforma uma Stream de valores T
        // em um único resultado do tipo T
        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
        int result = nums.stream().reduce(0, sum);
        
        List<String> words = List.of("House", "Car", "Airplane", "Banana");
        BinaryOperator<String>join = (string1, string2) -> string1 + string2;
        String resultString = words.stream().reduce("", join);
        System.out.println(result);
        System.out.println(resultString);
    }
}
