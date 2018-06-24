import java.math.BigInteger;

class Big {

    public static void main(String[] args) {
        factorial();
    }

    static void factorial() {
        for (int num = 0; num <= 30; num++) {
            BigInteger fact = BigInteger.valueOf(1L);
            for (int i = 1; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(num + "! = " + fact);
        }
    }
}