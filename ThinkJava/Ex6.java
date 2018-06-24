public class Ex6 {
  
  public static void main(String[] args) {
      System.out.println(gauss(2, 5));
      System.out.println(gauss(4, 6));  
  }

  static double gauss(int x, int n) {
      double res = 1.0, term;
      int nu = 1, de = 1;

      for (int i = 1; i < n; i++) {
          term = (nu * x * x) / (de * i);

          if (i % 2 == 0) {
              res += term;  
          }
          else {
              res -= term;
          }

          // update numerator and denominator
          nu = nu * x * x;
          de = de * i;
      } 
      return res; 
  }
}