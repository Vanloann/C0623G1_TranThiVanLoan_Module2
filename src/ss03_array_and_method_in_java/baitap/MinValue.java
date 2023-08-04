package ss03_array_and_method_in_java.baitap;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nThe smallest element in array is " + min);
    }
}
