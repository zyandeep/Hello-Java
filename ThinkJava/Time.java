public class Time {
  
  public static void main(String[] args) {

    // System.out.print("No. of seconds elapse since midnight: ");
    // System.out.println((12 * 60 * 60) + (3 * 60) + 49);
    
    // System.out.print("No. of seconds remaining in the day: ");
    // System.out.println((24 * 60 * 60) - ((12 * 60 * 60) + (3 * 60) + 49));
    
    // System.out.print("Percentage of the day that has passed: ");
    // System.out.println((float) ((12 * 60 * 60) + (3 * 60) + 49) / (24 * 60 * 60) * 100);
    
    int timeElapsed = ((13 * 60 * 60) + (40 * 60) + 5) - ((12 * 60 * 60) + (3 * 60) + 49);
    
    int seconds = timeElapsed % 60;
    int minutes = timeElapsed / 60; 
    int hour = minutes / 60;
    minutes %= 60;
    
    System.out.println("The time elapsed: " + timeElapsed);
    System.out.println("Hour: " + hour);
    System.out.println("Minute: " + minutes);
    System.out.println("Second: " + seconds);
    
  }
}