public class Divisible { 
  
  /*static int hello(int a) {
     return 2 * a;
  }*/
  
  static boolean isDivisible(int m, int n) {
    if (n % m == 0) 
      return true;
    else
      return false;
  }
  
 
  public static void main(String[] args) {
    System.out.println(isDivisible(6, 12));
  }
}