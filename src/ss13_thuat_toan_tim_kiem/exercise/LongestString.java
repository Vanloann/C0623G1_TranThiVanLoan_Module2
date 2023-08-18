package ss13_thuat_toan_tim_kiem.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
//        for (int i = 0; i < string.length(); i++) {
//            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
//                list.clear();
//            }
//            list.add(string.charAt(i));
//            if (list.size() > max.size()) {
//                max.clear();
//                max.addAll(list);
//            }
//        }
        System.out.println();
        for (Character chaz : max) {
            System.out.print(chaz);
        }
    }
}
