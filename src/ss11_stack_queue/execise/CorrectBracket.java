package ss11_stack_queue.execise;

import jdk.nashorn.internal.ir.Symbol;

import java.util.Arrays;
import java.util.Stack;

public class CorrectBracket {
    public static boolean checkBracket() {
        Stack<String> stack = new Stack<>();
        String str = "s * (s – a) * (s – b) * (s – c)";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                stack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (checkBracket()) {
            System.out.println("Expression has valid brackets");
        } else {
            System.out.println("Expression has invalid brackets");
        }
    }
}
