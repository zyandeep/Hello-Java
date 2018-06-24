import java.util.Scanner;

public class Recursion {

  static void calRec(int n) {
    if (n > 0) {
      calRec(n / 2);
      System.out.print(n % 2);
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Decimal number: ");
    int number = sc.nextInt();
    
    calRec(number);
    System.out.println();
  }
}