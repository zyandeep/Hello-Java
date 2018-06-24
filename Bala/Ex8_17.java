class BankAccount {
    private String nameOfDep;
    private long accNo;
    private String typeOfAcc;
    private double balance;

    BankAccount() {
        nameOfDep = "Zyandeep Baruah";
        accNo = 9954101L;
        typeOfAcc = "Savings";
        balance = 15000.70;
    }

    public void withDrawBalance(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn!");
        }
        else
            System.out.println("The amount couldn't be withdrawn!");
    }
    public void display() {
        System.out.println("Account Name: " + nameOfDep);
        System.out.println("Account Type: " + typeOfAcc);
        System.out.println("Available balance: " + balance);
    }
}


class Ex8_17 {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        
        b.withDrawBalance(1300.40);
        b.display();
    }
}