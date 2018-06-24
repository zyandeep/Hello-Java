public class SquareRoot {
  
  public static void main(String[] args) {
    System.out.printf("%.2f\n", squareRoot(9.0));
    System.out.printf("%.2f\n", squareRoot(25.0));
  }
  
  static double squareRoot(double a){
    double diff, x0, x1;
    x0 = a / 2;
    
    do {
      x1 = (x0 + a/x0) / 2;
      diff = Math.abs(x0 - x1);
      x0 = x1;
      
    } while (diff > 0.0001);
    
    return x1;
  }
}