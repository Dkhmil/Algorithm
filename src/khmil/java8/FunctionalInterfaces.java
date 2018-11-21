package khmil.java8;

import java.util.Scanner;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(-23));
        System.out.println(predicate.test(7));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x / y;
        System.out.println(binaryOperator.apply(10, 2));

        UnaryOperator<Double> unaryOperator = x -> x * x * x;
        System.out.println(unaryOperator.apply(0.000054));

        Function<Integer, String> transform = s -> s + "efrwegaeg";
        System.out.println(transform.apply(10));

        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600);

        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            return new User(name);
        };

        User user = userFactory.get();
        User user1 = userFactory.get();

        System.out.println(user.getName());

    }

    static class User {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public User(String name) {
            this.name = name;
        }
    }
}