package ss13_thuat_toan_tim_kiem.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryWithRecursion {
    public static void main(String[] args) {
        BinaryWithRecursion binaryWithRecursion = new BinaryWithRecursion();
        int[] arr = {10, 4, 20, 1, 9, 15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int value = 20;
        int left = 0;
        int right = arr.length - 1;
        int index = binaryWithRecursion.binarySearch(arr, left, right, value);
        if (index >= 0) {
            System.out.println("Position of value " + value + ": " + index);
        } else {
            System.out.println("Value is not found");
        }
    }

    public int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (value > array[mid]) {
                return binarySearch(array, mid + 1, right, value);
            } else {
                return binarySearch(array, left, mid - 1, value);
            }
        }
        return -1;
    }
}
