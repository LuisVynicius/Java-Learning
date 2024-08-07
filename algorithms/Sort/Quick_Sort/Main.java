package algorithms.Sort.Quick_Sort;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 0, 2, 9, 3, 8, 4, 7, 5, 6);
        list = quickSort(list);
        list.forEach(System.out::println);
    }

    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);
            List<Integer> less = list.stream().skip(1).filter(x -> x <= pivot).toList();
            List<Integer> greater = list.stream().skip(1).filter(x -> x > pivot).toList();
            return Stream.of(
                    quickSort(less).stream(),
                    Stream.of(pivot),
                    quickSort(greater).stream()
                ).flatMap(Function.identity()).toList();
        }
    }

}
