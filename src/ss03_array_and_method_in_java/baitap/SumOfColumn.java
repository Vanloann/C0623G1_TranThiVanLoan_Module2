package ss03_array_and_method_in_java.baitap;

import java.util.Scanner;

public class SumInAColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner scanner = new Scanner(System.in);
// Elements input by Users:
//        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = scanner.nextInt();
//            }
//        }

// Random elements
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                matrix[row][column] = (int) (Math.random()* 100);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter column: ");
        int col = scanner.nextInt();
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][col];
        }
        System.out.println("Sum of elements in column " + col + " is: " + sum);
    }
}

