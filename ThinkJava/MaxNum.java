public class MaxNum {

    public static void main(String[] args) {
        int[] a = {4, 9, 10, 2, 12, 33};

        System.out.println(maxInRange(a, 0, a.length - 1));
    }

    static int maxInRange(int[] a, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return a[lowIndex];      // a[highIndex]
        }
        else {
            int mid = (lowIndex + highIndex) / 2;

            int m1 = maxInRange(a, lowIndex, mid);
            int m2 = maxInRange(a, mid+1, highIndex);

            return ((m1 > m2) ? m1 : m2);
        }
    }
} 