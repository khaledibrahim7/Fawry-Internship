public class Account {
    private String accountNumber;
    private String name;
    protected double balance;

    public Account(String accountNumber, String name, double balance) {
        setAccountNumber(accountNumber);
        setName(name);
        setBalance(balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("your balance now is "+ balance);
        } else {
            System.out.println("amount not valid");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Your balance now is "+ balance);
        } else {
            System.out.println("amount not valid");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}