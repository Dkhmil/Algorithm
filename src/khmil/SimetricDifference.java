package khmil;

import java.util.*;

public class SimetricDifference {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        num1.add(3);
        num1.add(7);
        num1.add(9);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(5);
        num2.add(7);
        num2.add(12);

        Set<Integer> result = symmetricDifference(num1,num2);
        System.out.println(result);

    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        Set set = new HashSet(set1);
        set.addAll(set2);
        set.removeAll(set3);
        return (Set<T>) set;
    }
}
