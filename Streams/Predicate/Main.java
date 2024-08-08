package Streams.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("House", "Car", "Airplane", "Banana");
        // Analisa um item e retorna
        // um booleano a partir da verficação
        Predicate<String> predicate = word -> word.contains("a");
        list.stream().filter(predicate).forEach(System.out::println);
    }
}