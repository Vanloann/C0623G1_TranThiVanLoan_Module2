package ss02_vong_lap.baitap;

import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int count = 0;
        int num = 2;
        boolean check;

        while (count < number) {
            check = true;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                count++;
                System.out.println(num);
            }
            num++;
        }
    }
}
