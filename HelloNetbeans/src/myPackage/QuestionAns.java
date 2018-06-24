//

package myPackage;

import java.util.Scanner;

public class QuestionAns {
    
    public static void main(String[] args) 
    {
        String userAns;
        String corAns = "James Gosling";
        boolean lc = true;
        int count = 0;
        
        Scanner input = new Scanner( System.in );
        
        do
        {
            System.out.println(" Who developed Java? ");
            userAns = input.nextLine();
            
            //
            count++;
            
            if( userAns.equalsIgnoreCase( corAns ) )
            {
                System.out.println("Good!");
                lc = false;
            }
            else
            {
                if( count == 3 )
                {
                    System.out.println(" Correct answer: " + corAns );
                    lc = false;
                }
                else
                {
                    System.out.println(" Try again !");
                }
            }
        }
        while( lc );
        
    }
}
