package ss11_stack_queue.practice;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("After pushing elements: " + stack.size());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("After poping elements: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("After pushing elements: " + stack.size());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("After poping elements: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of Strings");
        stackOfStrings();
        System.out.println("Stack of Integer");
        stackOfIntegers();
    }
}
