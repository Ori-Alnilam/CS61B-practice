public class ArgsSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, l = args.length; i < l; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}