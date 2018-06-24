import java.util.Scanner;

public class Converter {
  
  public static void main(String[] args) {
    int inch;
    double cm;
    Scanner in = new Scanner(System.in);
    final double CM_PER_INCH = 2.54;        // a constant in Java

    System.out.print("How many inches: ");

    inch = in.nextInt();
    cm = inch * CM_PER_INCH;

    // System.out.print(inch + " in = ");
    // System.out.println(cm + " cm");

    System.out.printf("%d in = %.3f cm\n", inch, cm);
  }
}