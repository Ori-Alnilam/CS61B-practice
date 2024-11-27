package hw.hw0;

public class ReturnMax {
    public static int max(int[] a) {
        int max = a[0];
        for (int number : a) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}