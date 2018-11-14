package khmil;

import java.util.*;
import java.util.ArrayList;
import java.util.function.*;

import static java.lang.Integer.parseInt;

public class ReversedOrder {

    private static int arrayLength;

    @Override
    public String toString() {
        return "ReversedOrder{}";
    }

    private static int[] arr;
    private static Scanner a = new Scanner(System.in);

    private static String getLine() {
        String entered = a.nextLine();
        return entered;
    }


    private static List<Integer> enterArray() {
        System.out.println("Enter Array:");
        String enteredArray = getLine();
        String[] numbers = enteredArray.split(" ");
        List<Integer> inputArray = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (parseInt(numbers[i]) % 2 == 0) {
                inputArray.add(parseInt(numbers[i]));
            }
        }

        return inputArray;
    }

    public static void main(String[] args) {

        List<Integer> list = enterArray();
        ListIterator li = list.listIterator(list.size());
        while(li.hasPrevious()) {
            String element = li.previous().toString();
            System.out.print(element + " ");
        }

    }

}
