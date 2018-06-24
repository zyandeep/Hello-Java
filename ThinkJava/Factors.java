public class Factors {

    public static void main(String[] args) {
        int[] a = {5, 30, 10, 20};

        System.out.println(areFactors(5, a));
    }

    static boolean areFactors(int n, int[] values) {
        for (int value : values) {
            if (value % n != 0) {
                return false;
            }
        }
        return true;
    }
} 