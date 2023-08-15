package ss11_stack_queue.execise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryConverting {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int quotient;
        String str = "";

        do {
            stack.push(num % 2);
            quotient = num / 2;
            num = quotient;
        } while (quotient >= 1);
        System.out.println(stack);

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str += stack.pop();
        }
        System.out.println(str);
    }
}
