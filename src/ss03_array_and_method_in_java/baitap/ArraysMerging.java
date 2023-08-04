package ss03_array_and_method_in_java.baitap;

import java.util.Arrays;

public class ArrayMerging {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 25, 8, 19, 34, 67};
        int[] arr2 = {10, 56, 37, 89, 6, 3, 0};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            index++;
        }
        System.out.println(index);
        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
