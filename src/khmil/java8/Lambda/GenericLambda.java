package khmil.java8.Lambda;

public class GenericLambda {
    public static void main(String[] args) {
        Additionable<Integer> additionable = (x, y) -> x + y;
        Additionable<String> additionable1 = (x, y) -> x + y;
        System.out.println(additionable.add(10,20));
        System.out.println(additionable1.add("d","qqqqqqqqqqqqq"));
    }

}

interface Additionable<T> {
    T add(T t, T s);
}
