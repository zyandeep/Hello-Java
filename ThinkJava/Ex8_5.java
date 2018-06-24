import java.util.Arrays;

public class Ex8_5 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(30)));
    }

    static boolean[] sieve(int n) {
        boolean[] numbers = new boolean[n];
        int index = 0, num = 2;
        boolean isCrossed = true;

        for (int i=2; i < numbers.length; i++) {
            numbers[i] = true;
        }

        while (isCrossed) {
            isCrossed = false;

            for (int p = 2; num*p < n; p++) {
                index = num*p;

                if (numbers[index] == true) {
                    numbers[index] = false;

                    if (!isCrossed) {
                        isCrossed = true;
                    }
                }
            }

            /*do {
                num++;
            } while (numbers[num] == false);*/

            while (numbers[++num] == false) {}
        }
        return numbers;
    }
}