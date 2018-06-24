public class OddSum {

    public static void main(String[] args) {
        System.out.println(oddSum(3));
        System.out.println(oddSum(7));
        System.out.println(oddSum(15));
    }

    static int oddSum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + oddSum(n - 2);
        }
    }
}