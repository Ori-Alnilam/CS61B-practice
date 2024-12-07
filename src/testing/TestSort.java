package testing;

public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    /** Test the Sort.findSmallest method. */
    public static void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input);
        org.junit.Assert.assertEquals(expected, actual);
    }

    /** Test the Sort.swap method. */
    public static void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        Sort.swap(input, a, b);
        String[] expected = {"an", "have", "i", "egg"};

        org.junit.Assert.assertArrayEquals(expected, input);

    }

    public static void main(String[] args) {
        testSwap();
    }
}