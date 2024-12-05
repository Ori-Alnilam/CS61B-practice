package testing;

public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
    }

    /** Swap item a with b */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Return the smallest String in x. */
    public static String findSmallest(String[] x) {
        String smallest = x[0];
        for (String s : x) {
            if (s.compareTo(smallest) < 0) {
                smallest = s;
            }
        }
        return smallest;
    }
}