class Multiplication {

    public static void main(String[] args) {
        printTable(7, 7);
    }

    static void printTable(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.printf("%4d ", i * j);
            }
            System.out.println();
        }
    }
}