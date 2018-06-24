package student;

public class Student {
    public int rollNumber;

    public void getNumber(int n) {
        rollNumber = n;
    }
    public void putNumber() {
        System.out.println("Roll No: " + rollNumber);
    }
}