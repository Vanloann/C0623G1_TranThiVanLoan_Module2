package ss01_introduction_to_java.baitap;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();
        String toWord;
        String[] arrUnits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arrTens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] arrHundreds = {"one-hundred", "two-hundred", "three-hundred", "four-hundred", "five-hundred", "six-hundred", "seven-hundred", "eight-hundred", "nine-hundred"};

        if (number >= 0 && number < 10) {
            for (int i = 0; i < arrUnits.length; i++) {
                if (number == i) {
                    System.out.println(arrUnits[i]);
                }
            }
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    toWord = "ten";
                    break;
                case 11:
                    toWord = "eleven";
                    break;
                case 12:
                    toWord = "twelve";
                    break;
                case 13:
                    toWord = "thirteen";
                    break;
                case 14:
                    toWord = "fourteen";
                    break;
                case 15:
                    toWord = "fifteen";
                    break;
                case 16:
                    toWord = "sixteen";
                    break;
                case 17:
                    toWord = "seventeen";
                    break;
                case 18:
                    toWord = "eighteen";
                    break;
                case 19:
                    toWord = "nineteen";
                    break;
                default:
                    toWord = "out of ability";
                    break;
            }
            System.out.println(toWord);

        } else if (number >= 20 && number < 100) {
            double tens = Math.floor(number / 10);
            double units = number % 10;
            for (int i = 0; i < arrTens.length; i++) {
                for (int j = 0; j < arrUnits.length; j++) {
                    if (tens - 2 == i && units == j && units != 0) {
                        System.out.println(arrTens[i] + "-" + arrUnits[j]);
                    }
                }
            }
        } else if (number >= 100 && number < 1000) {
            double hundreds = Math.floor(number / 100);
            double remain = number % 100;
            double tens = Math.floor(remain / 10);
            double units = remain % 10;
            for (int i = 0; i < arrHundreds.length; i++) {
                for (int j = 0; j < arrTens.length; j++) {
                    for (int k = 0; k < arrUnits.length; k++) {
                        if (hundreds - 1 == i && tens - 2 == j && units == k) {
                            System.out.println(arrHundreds[i] + " and " + arrTens[j] + arrUnits[k]);
                        }
                    }
                }
            }
        } else {
            System.out.println("out of ability");
        }
    }
}

