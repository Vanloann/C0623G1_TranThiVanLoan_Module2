package ss03_array_and_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ElementAdding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\nEnter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();


        int[] newArr = new int[arr.length + 1];

        if (index <= -1 || index >= newArr.length - 1) {
            System.out.println("Cannot insert " + number + " into the array");
            return;
        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = number;

            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}


