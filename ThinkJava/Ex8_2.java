import java.util.Arrays;

public class Ex8_2 {

    public static void main(String[] args) {
        int[] scores = {10, 10, 10, 15, 15, 46, 51, 52, 52, 62, 67, 67, 74};

        System.out.println(Arrays.toString(histogram(scores, 8))); 
    }

    static int[] histogram(int[] scores, int size) {
        int[] counters = new int[size];

        for (int i=0, j=0; i < scores.length; i++) {
            if (counters[j] == 0) {
                counters[j]++;
            }
            else {
                if (scores[i] == scores[i-1]) {
                    counters[j]++;       
                }
                else {
                    j++;
                    counters[j]++;
                }
            }
        }
        return counters;
    }
} 