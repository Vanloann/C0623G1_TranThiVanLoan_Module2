package ss01_introduction_to_java.baitap;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;

        System.out.println("Enter amount of money (USD): ");
        usd = scanner.nextDouble();
        vnd = usd * 23000;

        System.out.println(vnd + " VND");
    }
}
