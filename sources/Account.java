/* A Real-world class
*  Date: 01-sept-13
**************************/
class BankAccount
{
	private String depositor, acType;
	private long acNo;
	private double balance;
	BankAccount(String d,String acType,long an)
	{
		depositor=d;
		acNo=an;
		this.acType=acType;
		balance=0.0;
	}
	void display()
	{
		System.out.println(" Account Holder: "+depositor);
		System.out.println(" Current account balance= "+balance);
	}	
	void deposite(double b)
	{
		balance+=b;
		display();  //nesting of methods
	}
	void withDraw(double b)
	{
		if(balance<b)
		{
			System.out.println(" Insufficient balance to withdraw!");
			return;
		}
		balance-=b;
		System.out.println(" "+b+" has been withdrawn");
		System.out.println(" Net balance after withdrawn= "+balance);
	}
}

class Account
{
	public static void main(String[] z)
	{
		BankAccount b=new BankAccount("zyaandeep","savings",123456L);
		b.deposite(5280.00);
		b.withDraw(3000.00);
		b.display();
	}
}	