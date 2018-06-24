public class Ex9_6 {

    public static void main(String[] args) {
        System.out.println(isAbecedarian("acknow"));
    }

    static boolean isAbecedarian(String str) {
        int i = 0;

        while (i < str.length() - 1) {
            if (str.charAt(i) > str.charAt(i+1)) {
                return false;
            }
            i++;
        }
        return true;
    }
} 