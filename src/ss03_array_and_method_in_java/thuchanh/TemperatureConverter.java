package ss03_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));

                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                case 3:
                    System.exit(3);
            }
        } while (choice != 3);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * (9.0 / 5) + 32;
        return fahrenheit;
//        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
