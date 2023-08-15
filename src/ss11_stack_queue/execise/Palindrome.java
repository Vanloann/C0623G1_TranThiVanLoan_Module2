package ss11_stack_queue.execise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String str = "Able was I ere I saw Elba";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i].toLowerCase());
            queue.add(arr[i].toLowerCase());
        }
        boolean isPalindrone = false;
        for(int i = 0 ; i < arr.length/2 ; i++){
            String s = stack.pop();
            String a = queue.peek();
            queue.remove();
            if(s.equals(a)){
                isPalindrone = true;
            }else{
                System.out.println("false");
                break;
            }
        }
        if(isPalindrone){
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }
//        System.out.println(stack);
//        System.out.println(queue);
    }

}
