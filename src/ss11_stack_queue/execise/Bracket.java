package ss11_stack_queue.execise;

import javafx.scene.chart.BarChart;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public String[] stringToArray(String string){
        String[] arrayString = string.split("");
        return arrayString;
    }

    public boolean checkTheKeyTag(String string) {
        String[] arrayString = stringToArray(string);
        Stack bStack = new Stack<>();
        Stack sym = new Stack<>();
        Stack left = new Stack<>();
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals("(")) {
                bStack.push(arrayString[i]);
                sym.push(arrayString[i]);
            } else if (arrayString[i].equals(")")) {
                if (bStack.empty()) {
                    return false;
                } else {
                    left.push(bStack.pop());
                }
            }
        }
        if (sym.equals(left)) {
            return true;
        } else {
            return false;
        }
    }

    public void result(String string){
        boolean result = checkTheKeyTag(string);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String string = scanner.nextLine();
        Bracket checkTheKeyTag = new Bracket();
        checkTheKeyTag.result(string);
    }
}
