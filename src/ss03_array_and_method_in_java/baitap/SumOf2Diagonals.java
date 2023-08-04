package ss03_array_and_method_in_java.baitap;

import java.util.Scanner;

public class SumOf2Diagonals {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }

//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Sums of elements in the 2 main diagonals are " + sum1 + " and " + sum2 + ", respectively.");
    }
}
