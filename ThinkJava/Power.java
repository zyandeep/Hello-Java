class Power {

    public static void main(String[] args) {
        System.out.println(power(3, 0));
        System.out.println(power(1, 2));
        System.out.println(power(2, 3));
        System.out.println(power(3, 3));
    }

    static double power(double x, int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return x * power(x, n-1);
        }
    }
}