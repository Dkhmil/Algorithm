package khmil.java8.Lambda;


interface Equalizer {
    boolean isEqual(int i);
}

class EqualizerHelper {
    static boolean isNegative(int i) {
        return i < 0;
    }

    static boolean isPositive(int i) {
        return i >= 0;
    }
}

public class LambdaRefMethod {
    public static void main(String[] args) {
        int[] nums = {1, 6, 6, 353, -9, 6, 3, -879};
        System.out.println(sum(nums, EqualizerHelper::isNegative));
        System.out.println(sum(nums, EqualizerHelper::isPositive));

    }

    private static int sum(int[] arr, Equalizer equalizer) {
        int result = 0;
        for (int i : arr) {
            if (equalizer.isEqual(i)) {
                result += i;
            }
        }
        return result;
    }

}