package khmil.java8.StreamAPI;



import java.util.Arrays;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args) {

       /* List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream()
                .filter(x -> x.length() == 6)
                .forEach(s -> System.out.println(s));*/
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид") ;
        citiesStream.forEach(System.out::println);
    }
}
