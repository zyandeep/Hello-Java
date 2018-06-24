import java.io.*;

class PalindromNum {

    int givePalindrom(int num)  {
        int mod, revNum;
        mod = revNum = 0;

        while (num > 0) {
            mod = num % 10;
            revNum = revNum * 10 + mod;
            num = num / 10;
        }

        return revNum;
    }
}


public class PalinNumFunc {

    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int number = 0;

        System.out.println("Enter a number: ");
        
        try {
            number = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}

        PalindromNum p = new PalindromNum();
        
        if (number == p.givePalindrom(number)) {
            System.out.println("It's a palindrom");
        }
        else {
            System.out.println("It's NOT a palindrom");
        }   
    }
}
