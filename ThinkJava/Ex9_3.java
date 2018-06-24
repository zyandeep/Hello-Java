public class Ex9_3 {

    public static void main(String[] args) {
        System.out.println(paren("(((3 + 7) * 2)"));
    }

    static int paren(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            }
            else if (str.charAt(i) == ')') {
                count--;
            }
        }
        return count;
    }
} 