class Ex6_10 {

    public static void main(String[] args) {
        System.out.print("Number ");
        for (double i = 0.0; i <= 0.9;) {
            System.out.printf("%.1f  ", i);
            i = i + 0.1;
        }
        for (double i = 0.0; i <= 9.9; i=i+1.0) {
            System.out.printf("\n%.1f   ", i);
            for (double j = 0.0; j <= 0.9;) {
                System.out.printf("%.2f   ", Math.sqrt(i+j));
                j = j + 0.1;
            }
        }
        System.out.println();  
    }
}
