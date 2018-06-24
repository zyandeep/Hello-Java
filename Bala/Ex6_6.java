class Ex6_6 {

    public static void main(String[] args) {
        int number = 0, sum = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 7 == 0) {
                sum += i;
                number++;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Total = " + number);
    }
}