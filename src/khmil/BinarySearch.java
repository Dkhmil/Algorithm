package khmil;

public class BinarySearch {

    public static void modifiedBinarySearch(int key, int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        int target = -1;
        while (first <= last) {
            int mid = (last + first) / 2;
            if (arr[mid] == key) {
                target = mid;
            }
            if (arr[mid] <= arr[last]) {
                if (key > arr[mid] && key <= arr[last] && key == arr[first]) {
                    last = mid - 1;
                } else if (key > arr[mid] && key <= arr[last]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            } else {
                if (arr[first] <= key && key <= arr[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        System.out.println("Index of required element:  " + target);
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 9, 10, 15, 1, 3, 4};
        int array[] = {5, 5, 1, 3, 4, 5, 5, 5, 5};
        int key =3;
        modifiedBinarySearch(key, array);
    }
}