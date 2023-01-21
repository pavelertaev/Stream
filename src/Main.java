

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
       List<Integer> number = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).toList();


        //Задание 2
        byEvenNumber(number.stream());
        //Задание 1
        System.out.println(" ");
        findMinMax(number.stream(),Collections.reverseOrder(),(max , min) -> System.out.println( "Максимальное число - " + max + " ," +
                "  " + "Минимальное число - " +  min));
    }

    //Задание 1
    public  static <T> void findMinMax(Stream<? extends T> stream,
                                       Comparator<? super T> comparator,
                                       BiConsumer<? super T,? super T> minMaxconsumer){

        List<? extends T> number = stream.sorted(comparator).toList();
        if(number.isEmpty()){
            minMaxconsumer.accept(null, null);
        }else {
            minMaxconsumer.accept(number.get(0),number.get(number.size() - 1));
        }
    }



    //Задание 2
    public static void byEvenNumber(Stream<Integer> number) {
        List<Integer> l = number.filter(i -> i % 2 == 0).toList();
        System.out.println("Колличество четных чисел " + l.size());
        l.forEach(i -> System.out.print(i+", "));


    }
}