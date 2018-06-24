public class Ex8_4 {

    public static void main(String[] args) {
        int[] a = {12, 34, 22, 90, 45, 110};

        System.out.println(indexOfMax(a));
    }

    static int indexOfMax(int[] a) {
        int max = a[0], index = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }
} 