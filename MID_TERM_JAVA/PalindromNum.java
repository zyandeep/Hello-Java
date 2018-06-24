import java.io.*;

class PalindromNum {
    
    public static void main(String[] args) {
        DataInputStream br = new DataInputStream(System.in);
        int num = 0, revNum = 0, mod;

        System.out.println("Enter a number: ");
        
        try {
            num = Integer.parseInt(br.readLine());
        }
        catch(Exception e) {}
        
        int temp = num;

        while (num > 0) {
            mod = num % 10;
            revNum = revNum * 10 + mod;
            num = num / 10;
        }
        
        if (temp == revNum) {
            System.out.println("It's a palindrom");
        }
        else {
            System.out.println("It's NOT a palindrom");
        }       
    } 
}
