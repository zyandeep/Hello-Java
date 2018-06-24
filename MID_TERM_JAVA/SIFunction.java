import java.io.*;

class SimpleInterest {
    
    double calSI(double p, double r, int t) {
        double si = p * (r/100.0) * t;

        return si;
    }
}


public class SIFunction {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        double p = 0.0, r = 0;
        int t = 0;

        try {
            System.out.print("Enter the princple amount: ");
            p = Double.parseDouble(br.readLine());
            System.out.print("Enter the interest rate: ");
            r = Double.parseDouble(br.readLine());
            System.out.print("Enter the time: ");
            t = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}

        SimpleInterest si = new SimpleInterest();
        System.out.println("Simple interest is: " + si.calSI(p, r, t));
    }
}