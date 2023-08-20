package ss15_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Elements of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter index of any element: ");
        int index = sc.nextInt();
        try {
            System.out.println("Value of element at index" + index + " là: " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bound!");
        }
    }
}
