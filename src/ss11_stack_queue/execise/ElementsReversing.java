package ss11_stack_queue.execise;

import java.util.Arrays;
import java.util.Stack;

public class ElementsReversing {
    private static void stackOfInteger() {
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Before reversing: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("After reversing");
        System.out.println(Arrays.toString(array));
    }

    private static void stackOfStrings() {
        Stack<String> stack = new Stack<>();
        String string = "wonknuehtotni";

        System.out.println("Before reversing: ");
        System.out.println(string);
        char[] arr = string.toCharArray();
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            stack.push(String.valueOf(arr[i]));
        }
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += stack.pop();
        }
        System.out.println("After reversing: ");
        System.out.println(str);
    }

    public static void main(String[] args) {
        ElementsReversing reverse = new ElementsReversing();
        reverse.stackOfInteger();
        reverse.stackOfStrings();
    }
}
