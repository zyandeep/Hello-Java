class BankAccount {
    private String nameOfDep;
    private long accNo;
    private String typeOfAcc;
    private double balance;

    public void setNameOfDep(String name) {
        nameOfDep = name;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public void setTypeOfAcc(String toa) {
        typeOfAcc = toa;
    }
    public void setBalance(double bal) {
        this.balance = bal;
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


class Ex8_16 {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setNameOfDep("Zyandeep Baruah");
        b.setAccNo(9954101L);
        b.setTypeOfAcc("Savings");
        b.setBalance(15000.70);

        b.withDrawBalance(1300.40);
        b.display();
    }
}