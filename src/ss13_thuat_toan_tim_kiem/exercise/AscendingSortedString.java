package ss13_thuat_toan_tim_kiem.exercise;

import java.util.Scanner;

public class AscendingSortedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        String result = "";

        int comparedChar = string.charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= comparedChar) {
                result += string.charAt(i);
                comparedChar = string.charAt(i);
            }
        }
        System.out.println(result);
    }
}
