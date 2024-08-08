package Streams.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Aceita argumentos do tipo definido,
        // não "consomem" os itens originais
        Consumer<Integer> consumer = numero -> {
            if (numero % 2 == 0) {
                System.out.print(numero);    
            }
        };
        list.forEach(consumer);
    
    }
}
