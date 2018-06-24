class Freq {

    public static void main(String[] args) {
        final double L = 23.4;
        final double R = 4.887;
        
        for (double C = 0.01; C <= 0.1; C += 0.01) {
            double n = 1 / (L*C);
            double d = (R*R) / (4*C*C);
            
            double freq = n - d;
            System.out.println(n);
            System.out.println(d);
            System.out.println(freq);
        }
    }
}
