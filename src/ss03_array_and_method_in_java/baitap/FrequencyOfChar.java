package ss03_array_and_method_in_java.baitap;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String string = "HelloAugust";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length() ; i++) {
            if (string.charAt(i) == character){
                count++;
            }
        }
        System.out.println("Frequency of character " + character + " in the string is: " + count);
    }
}
