package ss03_array_and_method_in_java.baitap;

import java.util.Scanner;

public class MaxValueOf2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
//        Scanner scanner = new Scanner(System.in);
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

        int max = matrix[0][0];
        int indexMaxRow = 0;
        int indexMaxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexMaxRow = i;
                    indexMaxCol = j;
                }
            }
        }
        System.out.println("The largest value in matrix is " + max + " ,at position" + "[" + indexMaxRow + "]" + "[" + indexMaxCol + "]");
    }
}
