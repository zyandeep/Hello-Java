class Ex9_3 {
    
    public static void main(String[] args) {
        String palindrom = new String("Rod saw I was Dor");
        int len = palindrom.length();

        StringBuffer dest = new StringBuffer(len);
        
        for (int i = len-1; i >= 0; i--) {
            dest.append(palindrom.charAt(i));
        }

        System.out.println(dest);
    }
}