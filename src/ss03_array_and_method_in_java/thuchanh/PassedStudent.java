package ss03_array_and_method_in_java.thuchanh;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class PassedStudent {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size does not exceed 30");
            }
        } while (size > 30);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter mark of student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("List of students' marks: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] < 10) {
                count++;
            }
        }

        System.out.println("\n The number of students that passed the exam is: " + count);
    }
}
