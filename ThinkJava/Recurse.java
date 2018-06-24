class Recurse {

    public static char first(String s) {
        return s.charAt(0);
    }

    public static String rest(String s) {
        return s.substring(1);
    }

    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static int length(String s) {
        return s.length();
    }
/////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(printBackward("Coffee"));
    }

    static void printString(String str) {
        while (length(str) >= 2) {
            System.out.println(first(str));
            str = rest(str);
        }
        System.out.println(first(str));
    }

    static String printBackward(String str) {
        char[] revStr = new char[length(str)];
        int i = length(str) - 1;

        while (length(str) >= 2) {
            revStr[i--] = first(str);
            str = rest(str);
        }
        revStr[i] = first(str);
        return new String(revStr);
    }
}