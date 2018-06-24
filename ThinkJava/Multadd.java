public class Multadd {

    static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1 - b); 

        return multadd(a, b, c);
    }

    public static void main(String[] args) {
        //System.out.println(multadd(1.0, 2.0, 3.0));

        // sin (PI/4) + cos(PI/4) / 2
        /*double a = Math.cos(Math.PI / 4.0);
        double b = 0.5;
        double c = Math.sin(Math.PI / 4.0);*/

        /*double a = Math.log10(10);
        double b = 1;
        double c = Math.log10(20); */

        System.out.println(expSum(0));
        System.out.println(expSum(1));
        System.out.println(expSum(2));
    }
}