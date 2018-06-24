import java.util.Scanner;

class Ex9_15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine().toLowerCase();
        System.out.println("Enter the word: ");
        String word = sc.nextLine().toLowerCase();

        int lenOfWord = word.length();
        int startIndex = 0, count = 0, foundAtIndex;


        do {
            foundAtIndex = text.indexOf(word, startIndex);
            if (foundAtIndex >= 0) {
                count++;
                startIndex = foundAtIndex + lenOfWord;
            }

        } while(foundAtIndex >= 0);

        System.out.println(count);
    }
}