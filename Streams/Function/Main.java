package Streams.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Pega itens do primeiro genérico especificado
        // e as transforma no segundo tipo
        Function<Integer, String> function = numero -> String.valueOf(numero);
        List<String> list02 = list.stream().map(function).toList();
        list02.forEach(System.out::println);
    }
}
