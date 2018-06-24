class PoorDog {
  private int size;
  private String name;
  private int legs = 3;
  
  public int getSize() {
    return size;
  }
  public String getName() {
    return name;
  }
  public int getLegs() {
    return legs;
  }
}

public class DefaultInitValue {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();

        System.out.println("Dog size is: " + one.getSize());
        System.out.println("Dog name is: " + one.getName());
        System.out.println("Dog's legs are: " + one.getLegs());
    }  
}