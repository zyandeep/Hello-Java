import java.util.Arrays;

public class Ex9 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println(args.length);

        int max = Integer.MIN_VALUE, value;
        for (String arg : args) {
            value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max = " + max);
    }
}