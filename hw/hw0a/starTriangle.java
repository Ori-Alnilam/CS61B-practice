public class starTriangle {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}