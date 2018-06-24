public class Echo {
  
  public static void main(String[] args) {
    String line;
    java.util.Scanner in = new java.util.Scanner(System.in);

    System.out.print("Type something: ");
    line = in.nextLine();
    System.out.println("You said: " + line);

    System.out.print("Type something: ");
    line = in.nextLine();
    System.out.println("You also said: " + line);
  }
}