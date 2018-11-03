package khmil;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ranges {
    private static int arrayLength;
    private static int[] arr;
    private static Scanner a = new Scanner(System.in);

    private static String getLine() {
        String entered = a.nextLine();
        return entered;
    }

    private static int getLength() {
        System.out.println("Enter array length: ");
        int length = parseInt(getLine());
        if (length < 0) {
            throw new NegativeArraySizeException();
        }
        return length;
    }

    private static int[] enterArray() {
        System.out.println("Enter Array:");
        int[] inputArray = new int[arrayLength];
        String enteredArray = getLine();
        String[] numbers = enteredArray.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = parseInt(numbers[i]);
        }
        return inputArray;
    }

    private static int[] sortedArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i] = arr[i] + arr[i - 1];
                arr[i - 1] = arr[i] - arr[i - 1];
                arr[i] = arr[i] - arr[i - 1];
                i = 0;
            }
        }
        return arr;
    }

    private static void findingRanges(int[] arr) {
        System.out.print("Ranges : ");
        int i = 1;
        System.out.print("[" + arr[0] + " ");
        while (i < arr.length - 1) {
            if ((arr[i + 1] - arr[i] != 1) && (arr[i] - arr[i - 1] == 1)) {
                System.out.print(arr[i] + "]");
            } else if ((arr[i] - arr[i - 1] != 1) && (arr[i + 1] - arr[i] == 1)) {
                System.out.print("[" + arr[i] + " ");
            } else if ((arr[i] - arr[i - 1] != 1) && (arr[i + 1] - arr[i] != 1)) {
                System.out.print("[" + arr[i] + "]");
            }
            i++;
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void main(String[] args) {
        arrayLength = getLength();
        arr = enterArray();
        arr = sortedArray(arr);
        findingRanges(arr);
    }
}






