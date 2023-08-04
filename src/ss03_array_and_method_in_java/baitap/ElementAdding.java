package ss03_array_and_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ElementAdding {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 34, 6, 8, 25};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();

//    public static int[] newArray(int[] arr,int number, int index) {
        int[] newArr = new int[arr.length + 1];

        if (index <= -1 || index >= newArr.length - 1) {
            System.out.println("Cannot insert " + number + " into the array");
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


