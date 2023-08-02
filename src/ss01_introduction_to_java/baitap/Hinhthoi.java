package ss01_introduction_to_java.baitap;

public class Hinhthoi {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5*2; j++) {
                if (j + i == 6 || j == 5 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1 ; i--) {
            for (int j = 1; j <= 5*2; j++) {
                if (j +i == 6 || j == 5 + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
