package khmil.java8.Lambda;

public class LambdaAsParametr {
    public static void main(String[] args) {
        int[] valid = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println(sum(valid, x -> x % 3 == 0));
    }

    private static int sum(int[] arr, Validator val) {
        int result = 0;
        for (int i : arr) {
            if (val.isValid(i)) {
                result += i;
            }
        }
        return result;
    }
}


interface Validator {
    boolean isValid(int i);
}