/* Example of Hierarchical Inheritance
*  Date: 01-sept-13
**************************/
class Account
{
	String name;
	long acNo;
	private String acType;
	Account()
	{
		name="Zyandeep Baruah";
		acNo=8721075704L;
		acType="savings";
	}
}

class CurrAcct extends Account
{
	double minBal,balance;
	final int PANALTY=200;
	CurrAcct()
	{
		minBal=500;
		balance=0;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(acNo);
		System.out.println(" Current Balance= "+balance);
	}
	void deposite(double b)
	{
		balance+=b;
		System.out.println(" Current Balance= "+balance);
	}
	void balChk()
	{
		if(balance<minBal)
		{
			System.out.println(" A/c Balance is less then minimum balance!");
			System.out.println("Rs. "+PANALTY+" charged is imposed!");
			balance-=PANALTY;
			System.out.println(" Net Balance= "+balance);
		}
	}
	void withdraw(double b)
	{
		balChk();
		if(balance<b)
		{
			System.out.println(" Insufficient balance!" );
			return;
		}
		balance-=b;
		System.out.println(+b+" has been successfully withdrawn!");
		System.out.println(" Current Balance= "+balance);
	}
}	

class SavAcct extends Account
{
	double balance,interest;
	SavAcct()
	{
		interest=100.00;
		balance=0;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(acNo);
		System.out.println(" Current Balance= "+balance);
	}
	void deposite(double b)
	{
		balance+=b;
		System.out.println(" Current Balance= "+balance);
	}
	void withdraw(double b)
	{
		if(balance<b)
		{
			System.out.println(" Insufficient balance!" );
			return;
		}
		balance-=b;
		System.out.println(+(b+interest)+" has been successfully withdrawn!");
		System.out.println(" Current Balance= "+balance);
	}
}

class Inheritance
{
	static String obj=" Implementation of Inheritance(hierarchical)";
	public static void main(String[] args)
	{
		System.out.println(Inheritance.obj);
		CurrAcct c;
		SavAcct s;
		c=new CurrAcct();
		s=new SavAcct();
		System.out.println(" Operation on CURRENT account ");
		c.display();
		c.deposite(3
		00);
		c.balChk();
		c.deposite(10000);
		c.withdraw(3000);
		System.out.println(" Operation on Savings account ");
		s.display();
		s.deposite(5000);
		s.withdraw(3000);
	}
}			