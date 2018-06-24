import java.util.Arrays;

class Ex9_2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(letterHist("DipsikhaPhukan")));
    }

    static int[] letterHist(String str) {
        int[] histogram = new int[26];
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            histogram[c - 97]++;
        }
        return histogram;
    }
} 