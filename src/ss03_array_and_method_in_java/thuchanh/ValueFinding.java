package ss03_array_and_method_in_java.thuchanh;

import java.util.Scanner;

public class ValueFinding {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student's name: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;

        for (int i = 0; i < students.length; i++) {
            if (inputName.equals(students[i])) {
                System.out.println("Position of student " + inputName + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(inputName + " cannot be found in the list");
        }
    }
}
