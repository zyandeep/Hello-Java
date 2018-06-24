public class Triangle {
  
  static boolean isTriangle(int a, int b, int c) {
    if (a > (b + c) || b > (c + a) || c > (a + b))
      return false;
    else
      return true;
  }
  
  public static void main(String[] args) {
    System.out.println(isTriangle(2, 3, 4));
    System.out.println(isTriangle(1, 2, 4));
    System.out.println(isTriangle(7, 5, 4));
  }
}