class Account {
    String cusName;
    long accNo;
    String typeOfAcc;
    double balance;

    Account(String cusName, long accNo, String typeOfAcc, 
            double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.typeOfAcc = typeOfAcc;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Balance = " + balance);
    }
    public void withDrawBalance(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn!");
        }
        else
            System.out.println("The amount couldn't be withdrawn!");
    }
}

class CurrAcct extends Account {
    final private int penalty; 

    CurrAcct(String cusName, long accNo, String typeOfAcc, double balance) {
        super(cusName, accNo, typeOfAcc, balance);
        this.penalty = 100;
    }

    public void deposite(double amount) {
        this.balance += amount;
    }
    public void calPenalty() {
        if (balance < 500) {
            System.out.println(penalty + " has been imposed!");
            balance -= penalty;
            System.out.println("Updated balance = " + balance);
        }
    }
}

class SaveAcct extends Account {
    final private double r;
    final private double t;
    final private double n;
    private double ci;
    
    SaveAcct(String cusName, long accNo, String typeOfAcc, double balance) {
        super(cusName, accNo, typeOfAcc, balance);
        r = 0.04;
        t = 1;
        n = 4;
        ci = 0.0;
    }

    public void deposite(double amount) {
        computeInterest();
        this.balance += (amount * ci);
    };
    private void computeInterest() {
        ci = Math.pow((1 + r/n), n*t);
    }
}


class Ex8_18 {

    public static void main(String[] args) {
        CurrAcct ca = new CurrAcct("Jon", 12345, "current", 500);
        SaveAcct sa = new SaveAcct("Theon", 89445, "savings", 0.0);
        ca.deposite(1500);
        ca.displayBalance();
        ca.withDrawBalance(1900);
        ca.calPenalty();

        sa.deposite(1500);
        sa.displayBalance();
        sa.withDrawBalance(1000);
        sa.displayBalance();
    }
}