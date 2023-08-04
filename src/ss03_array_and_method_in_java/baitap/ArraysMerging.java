package ss03_array_and_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMerging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("Enter elements for array 1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Elements of array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }

        int[] arr2 = new int[6];
        System.out.println("\nEnter elements for array 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        System.out.print("Elements of array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }


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
        System.out.print("Merged array: ");
        System.out.print(Arrays.toString(arr3));
    }
}
