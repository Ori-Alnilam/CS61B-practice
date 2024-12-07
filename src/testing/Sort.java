package testing;

import java.util.Arrays;

public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
        int smallestIndex = findSmallest(x);
        swap(x, 0, smallestIndex);
    }

    /** Swap item a with b */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

    /** Return the index of smallest String in x. */
    public static int findSmallest(String[] x) {
        int smallestIndex = 0;
        for (String s : x) {
            if (s.compareTo(x[smallestIndex]) < 0) {
                smallestIndex = Arrays.asList(x).indexOf(s);
            }
        }
        return smallestIndex;
    }
}