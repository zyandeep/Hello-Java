import java.util.Scanner;
import java.util.Arrays;

class Ex9_16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        char[] newStr = str.toCharArray();
        Arrays.sort(newStr);

        System.out.println(new String(newStr));
    }
}