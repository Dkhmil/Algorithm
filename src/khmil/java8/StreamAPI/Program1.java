package khmil.java8.StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Program1 {

    /* public static void main(String[] args) {

         Stream<Phones> phoneStream = Stream.of(new Phones("iPhone X", "Apple", 600),
                 new Phones("Pixel 2", "Google", 500),
                 new Phones("iPhone 8", "Apple",450),
                 new Phones("Nokia 9", "HMD Global",150),
                 new Phones("Galaxy S9", "Samsung", 300));

         phoneStream.sorted(new PhoneComparator()).forEach(p->System.out.printf("%s (%s) - %d \n",
                         p.getName(), p.getPrice(), p.getPrice()));

     }*/
   /*public static void main(String[] args) {

       Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
       numbers.sorted()
       .takeWhile(n -> n < 0)
               .forEach(n -> System.out.println(n));
   }*/
    public static void main(String[] args) {


      int i = 5;
        factorial(i);
    }

    public static void factorial(int i) {
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x,y)->x*y);
        System.out.println(result.get()); // 720
    }
}

class PhoneComparator implements Comparator<Phones> {

    @Override
    public int compare(Phones a, Phones b) {

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }


}

class Phones {

    private String name;
    private String company;
    private int price;

    public Phones(String name, String comp, int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }
}