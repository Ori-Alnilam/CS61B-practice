package hw.hw0;

public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            // Skip negative values
            if (a[i] < 0) {
                continue;
            }
            for (int j = 1; j <= n; j++) {
                // Avoid going over the end of the array
                if (i + j > a.length - 1) {
                    break;
                }
                a[i] += a[i + j]; 
            }
        }
    }
  
    public static void main(String[] args) {
      int[] a = {1, 2, -3, 4, 5, 4};
      int n = 3;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    }
  }