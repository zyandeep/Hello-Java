import java.util.Scanner;

public class TimeConverter {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int input, hours = 0, minutes, seconds;

    System.out.print("Enter seconds: ");
    input = in.nextInt();

    seconds = input % 60;
    minutes = (int) input / 60;
    hours = (int) minutes / 60;
    minutes = minutes % 60;

    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", 
                        input, hours, minutes, seconds);
  }
}