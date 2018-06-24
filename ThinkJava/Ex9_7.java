public class Ex9_7 {

    public static void main(String[] args) {
        System.out.println(isAnagram("stop", "pots"));
        System.out.println(isAnagram("allen downey", "well annoyed"));
        System.out.println(isAnagram("aaln", "aeln"));
    }

    static boolean isAnagram(String s1, String s2) {
        boolean check = true;

        if (s1.length() == s2.length()) {
            char ch;
            for (int i=0; i < s1.length(); i++) {
                ch = s1.charAt(i);
                if (s2.indexOf(ch) == -1) {
                    check = false;
                    break; 
                }
                ch = s2.charAt(i);
                if (s1.indexOf(ch) == -1) {
                    check = false;
                    break; 
                }
            }
        }
        else
            check = false;

        return check;
    }
}