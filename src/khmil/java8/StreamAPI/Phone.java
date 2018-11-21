package khmil.java8.StreamAPI;

import java.util.stream.Stream;

public class Phone {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
       /* phoneStream.filter(p -> p.getPrice() > 50000)
                .forEach(System.out::println);*/
     /*  phoneStream.map(p -> p.getName())
               .forEach(System.out::println);*/

        phoneStream.flatMap(p -> Stream.of(
                String.format("2" + p.getPrice() + p.getName()),
                String.format("3" + p.getName() + p.getPrice())
        ))
                .forEach(System.out::println);
    }
}
