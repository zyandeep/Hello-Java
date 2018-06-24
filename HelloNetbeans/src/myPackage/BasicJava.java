// This is some basic of Java programming
package myPackage;

public class BasicJava {

    private int age;
    private String name;

    public BasicJava() {
        System.out.println("An instance got created!");
    }

    public void setData(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
    
    public String toString() {
       return String.format("Name is %s\n Age %d", this.name, this.age);
    }
}
