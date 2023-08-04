package ss02_vong_lap.baitap;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        boolean check;
        for (int i = 2; i < 100 ; i++) {
            check = true;
            for (int j = 2; j <= i/2 ; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
