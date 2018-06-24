class Ex6_12 {

    public static void main(String[] args) {
        byte i, j;
        byte b;

        for (i = 1; i <= 5; i++) {
            if (i % 2 == 0)
                b = 0;
            else 
                b = 1;
            for (j = 1; j <= i; j++) {
                System.out.print(b + " ");
                if (b == 0)
                    b = 1;
                else
                    b = 0;
            }
            System.out.println();
        }
    }
}