public class PrimeFactors {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3};

        System.out.println(arePrimeFactors(24, a));
    }

    static boolean arePrimeFactors(int n, int[] values) {
        int prod = 1;

        for (int value : values) {
            if (checkPrime(value)) {
                prod *= value;
            }
        }

        if (n == prod) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean checkPrime(int n) {
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
} 