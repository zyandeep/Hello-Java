import java.util.Arrays;

public class Ex8_1 {

    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4.2, 5.0, 6.7};

        System.out.println(Arrays.toString(powArray(a, 1)));
        System.out.println(Arrays.toString(powArray(a, 2)));
    }

    static double[] powArray(double[] a, int p) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], p);
        }
        return a;
    }
} 