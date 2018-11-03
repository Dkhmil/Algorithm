package khmil;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ArrayRotation {
    private static int arrayLength;
    private static Scanner a = new Scanner(System.in);

    private static String getLine() {
        String input = a.nextLine();
        return input;
    }

    private static int getLength() {
        System.out.println("Enter array length: ");
        int length = parseInt(getLine());
        if (length < 0) {
            throw new NegativeArraySizeException();
        }
        return length;
    }

    private static int movedIndexes() {
        System.out.println("number of elements,which would be moved:");
        int movedCount = parseInt(getLine());
        if (movedCount > arrayLength || movedCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        return movedCount;
    }

    private static int[] getArray() {
        System.out.println("Enter Array:");
        int[] inputArray = new int[arrayLength];
        String enteredArray = a.nextLine();
        String[] numbers = enteredArray.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = parseInt(numbers[i]);
        }
        return inputArray;
    }

    private static int[] changedArray(int movedCount, int[] inputArray) {
        int[] movedArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if ((i < movedCount)) {
                movedArray[arrayLength - i - 1] = inputArray[movedCount - i - 1];
            } else {
                movedArray[i - movedCount] = inputArray[i];
            }
        }
        System.out.println("changed Array: ");
        for (int j : movedArray) {
            System.out.print(j + " ");
        }
        return movedArray;
    }

    public static void main(String[] args) {
        arrayLength = getLength();
        changedArray(movedIndexes(), getArray());
    }

}



