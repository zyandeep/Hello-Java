public class Ex9_8 {
    
    public static void main(String[] args) {
        System.out.println(canSpell("quijibo", "jib"));
    }

    static boolean canSpell(String tiles, String word) {
        boolean isOkay = true;
        for (char ch : word.toCharArray()) {
            String temp = tiles.replaceFirst(String.valueOf(ch), "^");
            if (temp.length() == 0) {
                isOkay = false;
                break;
            }
            tiles = temp;   
        }
        return isOkay;
    }
}