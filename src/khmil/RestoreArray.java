package khmil;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RestoreArray {
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
        String enteredArray = a.nextLine();
        String[] numbers = enteredArray.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = parseInt(numbers[i]);
        }
        return inputArray;
    }
    private static boolean isMonotonic() {
        boolean monotonic = true;
        if (arr.length <= 2) {
            monotonic = true;
        } else {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < 0) continue;
                if (arr[i] - arr[i - 1] == 1 || arr[i] - arr[i - 1] == -1 || arr[i] - arr[i + 1] == -1) {
                    monotonic = true;
                } else {
                    monotonic = false;
                }
            }
        }
        return monotonic;
    }

    private static void changingArray(boolean monotonic) {
        if (monotonic == true) {
            System.out.print("Restored Array: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    arr[i] = (arr[i + 1] > arr[i - 1]) ? arr[i + 1] - 1 : arr[i + 1] + 1;
                }
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Non - monotonic array");
        }
    }

    public static void main(String[] args) {
        arrayLength = getLength();
        arr = enterArray();
        changingArray(isMonotonic());
    }
}

