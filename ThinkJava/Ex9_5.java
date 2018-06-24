public class Ex9_5 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("otto"));
    }

    static boolean isPalindrome(String str) {
        if (str.length() == 1) {
            return true;
        }
        else if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return isPalindrome(str.substring(1, str.length() - 1));
            }
            else {
                return false;
            }
        }
    }
} 