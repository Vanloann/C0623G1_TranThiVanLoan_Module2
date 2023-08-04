package ss03_array_and_method_in_java.thuchanh;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 4, 10, 8, 3};
        int index = minValue(arr);
        System.out.println("The smallest value in the array is: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
