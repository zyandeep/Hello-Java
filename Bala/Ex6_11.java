class Ex6_11 {

    public static void main(String[] args) {
        int i = 1, j, k=1;
        boolean test = true;
        
        while (test) {
            for (j = 1; j <= i; j++) {
                if (k > 91) {
                   test = false;
                   break; 
                }
                System.out.print(k++ + " ");
            }
            i++;
            System.out.println();
        }
    }
}
