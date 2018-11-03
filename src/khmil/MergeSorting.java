package khmil;

public class MergeSorting {

    private static void gettingParameters(int[] arr) {
        int last = arr.length - 1;
        int first = 0;
        mergeSorting(first, last, arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSorting(int first, int last, int[] arr) {
        if (last - first == 0) {
        } else if (last - first == 1) {
            if (arr[first] > arr[last])
                replacingOfElements(first, last, arr);
        } else {
            int mid = (first + last) / 2;
            mergeSorting(first, mid, arr);
            mergeSorting(mid + 1, last, arr);
            merge(first, last, mid, arr);
        }
    }

    private static void merge(int first, int last, int mid, int[] arr) {
        int i = first;
        while (i <= mid) {
            if (arr[i] > arr[mid + 1]) {
                replacingOfElements(mid + 1, last, arr);
            }
            i++;
        }
    }

    private static void replacingOfElements(int x, int y, int[] arr) {
        for (int i = x + 1; i <= y; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i] = arr[i] + arr[i - 1];
                arr[i - 1] = arr[i] - arr[i - 1];
                arr[i] = arr[i] - arr[i - 1];
                i = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 56, 89, 54, 76, 32, 11, 4, 0, -2, 569, 7, 77, 777, 2};
        gettingParameters(arr);
    }
}