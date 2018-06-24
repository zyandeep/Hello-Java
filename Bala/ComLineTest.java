class ComLineTest {

    public static void main(String[] args) {
        int count = args.length;

        System.out.println("Number of arguments: " + count);

        for (int i = 0; i < count; i++) {
            System.out.println("Java is " + args[i]);
        }
    }
}