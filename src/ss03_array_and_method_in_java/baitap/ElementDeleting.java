package ss03_array_and_method_in_java.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ElementDeleting {
    public static void main(String[] args) {
        int[] array = {13, 6, 7, 34, 50, 25};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
//        int[] newArr = ValueDeleting(array,number);
//        System.out.println(Arrays.toString(newArr));

//    public static int[] ValueDeleting(int[] array, int number) {
        int index_del = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index_del = i;
                System.out.println("number's position: " + index_del);

                for (int j = index_del; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
//        return array;
//    }
    }
}
