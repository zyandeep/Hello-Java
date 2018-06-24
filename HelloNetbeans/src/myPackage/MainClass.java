//

package myPackage;

import java.util.Scanner;

class Account 
{
    int acNo;
    String customerName;
    String acType;
    
    public Account( int ac, String name, String acType) 
    {
        acNo = ac;
        customerName = name;
        this.acType = acType;
    }
         
}


class SavingAccount extends Account 
{
    double balanceAmount;
    
    //
    Scanner input = new Scanner( System.in);
            
    
    public SavingAccount( int acNo, String name, String acType) 
    {
        super(acNo, name, acType); 
    }
    
    
    void acceptAmount()
    {
        System.out.println("\nEnter amount: ");
        
        balanceAmount += input.nextDouble();
    }
    
    
    void displayBal()
    {
        System.out.println("\nCustomer name: " + this.customerName );
        System.out.println("Account no: " + this.acNo );
        System.out.println("Account type: " + this.acType );
        System.out.println("Balance remaining in your account: " + this.balanceAmount );
    }
    
    
    void withdrawAmount()
    {
        System.out.println("\nEnter amount: ");
        
        double amount = input.nextDouble();
        
        if( checkMinBal( amount ) )
        {
            balanceAmount -= amount;
            
            System.out.println("\n" +  amount + " has been withdrawn.");
            System.out.println("Remaining balance: " + balanceAmount );
        }
        else 
        {
            System.out.println("\nYou have insufficient balance !");
        }
    
    }
    
    
    boolean checkMinBal( double amount)
    {
        if( this.balanceAmount < amount )
        {
            return false;
        }
        
        return true;
    }
    
}


class MainClass {
    
    public static void main(String[] args) 
    {
        SavingAccount s1 = new SavingAccount(21982, "Indrajit", "savings");
        
        Scanner sc = new Scanner( System.in ) ; 
        boolean loop = true;
        
        while( loop )
        {
            System.out.println("OPTIONS:");
            System.out.println("\n 1. Cash deposit");
            System.out.println("\n 2. View balance");
            System.out.println("\n 3. Cash withdraw");
            System.out.println("\n 4. Exit");
            
            System.out.println("\n\n\t Enter your option: ");
            
            short ans = sc.nextShort();
            
            //
            switch(ans) 
            {
                case 1:
                    s1.acceptAmount();
                    break;
                case 2:
                    s1.displayBal();
                    break;
                case 3: 
                    s1.withdrawAmount();
                    break;
                 case 4:
                    loop = false;
                    break;
                 default:
                     System.out.println(" Wrong input!");
            }
        }
    }
}

