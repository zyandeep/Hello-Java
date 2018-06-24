class Ex9_12 {
    
    public static void main(String[] args) {
        System.out.println(delete("Hello World", 4));
        System.out.println(delete("Hello World", 5));
    }

    public static String delete(String str, int m) {
        int length = str.length();
        StringBuffer newStr = new StringBuffer();

        if (m >= 0 && m < length) {
            for (int i = 0; i < length; i++) {
                if (i == m)
                    continue;
                newStr.append(str.charAt(i));
            }

            return newStr.toString();
        }
        else
            return null;
    }
}