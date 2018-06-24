class Ex7_9 {
    
    public static void main(String[] args) {
        double p = 1000, n = 10;
        double r = 0.10, v = 0.0;

        for (int i = 1; i <= n; i++) {
            v = p * Math.pow((1 + r), i);
            System.out.println("P = " + p + " r = " + r + " n = " + i);
            p = v;
            r = r + 0.01;
        }
    }
}