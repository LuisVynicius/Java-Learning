package Streams.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Não aceita argumentos,
        // apenas gera valores
        Supplier<String> supplier = () -> "valor";
        List<String> list = Stream.generate(supplier)
                                    .limit(5)
                                    .toList();
        list.forEach(System.out::println);
    }
}
