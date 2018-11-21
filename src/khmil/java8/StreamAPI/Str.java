package khmil.java8.StreamAPI;

import java.util.stream.IntStream;

public class Str {
    public static void main(String[] args) {
        int count = (int) IntStream.of(-5,-6,4,-6,-49,68,64,10)
                .filter(x -> x > 0)
                .count();
        System.out.println(count);

    }
}
