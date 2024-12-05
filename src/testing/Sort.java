package testing;

public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
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