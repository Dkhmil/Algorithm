package khmil.java8.Lambda;

public class Pinter {
    public static void main(String[] args) {
        Printable printable = s -> System.out.println(s);
        printable.print("avdfhbfdbabf");
    }

   }

   interface Printable{
    void print(String s);
   }