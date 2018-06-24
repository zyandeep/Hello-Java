public class Exponent {
  
  public static void main(String[] args) {
/*    System.out.println(myexp(1, 1));
    System.out.println(myexp(1, 2));*/

    check(1);
  }

  static int fact(int n) {
    if (n == 0)
        return 1;
    else
        return n * fact(n - 1);
  }

  static double myexp(int x, int n) {
    double res = 1;
    double term = 0;
    
    while (n > 0) {
        term = Math.pow(x, n) / fact(n);
        res += term;
        n--;
    }

    /*for (int nu=1, de=1, i=1; i <= n; i++ ) {
        term = (nu * x) / (de * i);
        res += term;
        nu = nu * x;
        de = de * i;
    }*/

    return res;
  }

  static void check(int x) {
    System.out.printf("%f\t%f\t%f\n", (float)x, myexp(x, 4), Math.exp(x));
  }
}