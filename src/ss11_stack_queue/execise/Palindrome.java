package ss11_stack_queue.execise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void checkPalindrome() {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        String str = "Able was I ere I saw Elba";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i].toLowerCase());
            queue.add(arr[i].toLowerCase());
        }

        boolean isPalindrome = false;
        for(int i = 0 ; i < arr.length / 2 ; i++){
            String strStack = stack.pop();
            String strQueue = queue.peek();
            queue.remove();
            if(strStack.equals(strQueue)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome == true){
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome();
    }

}
