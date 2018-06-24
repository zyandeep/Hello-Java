public class Date {
  
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    
    String day = "Saturday";
    String date = "24";
    String month = "June";
    int year = 2017;
    
    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    
    System.out.println("European format:");
    System.out.println(day + " " + month + " " + date + " " + year);
  }
}