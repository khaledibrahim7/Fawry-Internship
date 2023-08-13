public class SavingAccount extends Account{
    private double interestRate;


    public SavingAccount(String accountNumber, String name, double balance, double interestRate) {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterestRate() {
        double interestAmount = getBalance() * interestRate / 100;
        balance += interestAmount;
        System.out.println("your balance after adding the interestAmount is "+ balance);
    }

}


