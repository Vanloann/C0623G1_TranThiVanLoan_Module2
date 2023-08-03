package ss01_introduction_to_java.baitap;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        String[] arrUnits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr10To19 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arrTens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] arrHundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        if (number >= 0 && number < 10) {
            for (int i = 0; i < arrUnits.length; i++) {
                if (number == i) {
                    System.out.println(arrUnits[i]);
                }
            }
        } else if (number >= 10 && number < 20) {
            int tens = number % 10;
            System.out.println(arr10To19[tens]);
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int units = number % 10;
            if (units != 0) {
                System.out.println(arrTens[tens - 2] + "-" + arrUnits[units]);
            }
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remain = number % 100;
            int tens = remain / 10;
            int units = remain % 10;
            if (remain >= 10 && remain <= 19) {
                System.out.println(arrHundreds[hundreds - 1] + " and " + arr10To19[units]);
            } else if (remain >= 1 && remain <= 9) {
                System.out.println(arrHundreds[hundreds - 1] + " and " + arrUnits[units]);
            } else if (units == 0) {
                System.out.println(arrHundreds[hundreds - 1] + " and " + arrTens[tens - 2]);
            } else {
                System.out.println(arrHundreds[hundreds - 1] + " and " + arrTens[tens - 2] + "-" + arrUnits[units]);
            }
        } else {
            System.out.println("out of ability");
        }
    }
}

