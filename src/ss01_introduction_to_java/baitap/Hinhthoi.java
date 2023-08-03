package ss01_introduction_to_java.baitap;

public class Hinhthoi {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
                if (Math.abs(i) == Math.abs(j) && i != 0) {
                    System.out.print(Math.abs(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = -5; j <= 5; j++)
                if (i == Math.abs(j)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}

