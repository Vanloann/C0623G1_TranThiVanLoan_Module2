package ss14_sorting_algorithm.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, -2, 14, 12};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] list) {
        int x;
        int j;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            j = i - 1;
            while (j >= 0 && list[j] > x) {
                System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                list[j + 1] = list[j];
                j--;
            }
            System.out.println("Swap " + x + " with " + list[j + 1]);
            list[j + 1] = x;
        }
    }
}

