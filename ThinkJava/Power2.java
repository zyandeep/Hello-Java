public class Power2 {
  
  public static void main(String[] args) {
    System.out.println(power(4, 3));
    System.out.println(power(1, 7));
  }
  
  static double power(double x, int n) {
    double res = 1;

    while (n > 0) {
        res = res * x;
        n--; 
    }
    return res;
  }
}