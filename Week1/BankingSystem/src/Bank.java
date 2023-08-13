import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("your account added successfully.!!");
    }

    public void displayAccount(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("your accountNumber is : " + account.getAccountNumber());
            System.out.println("your balance is : " + account.getBalance());
            System.out.println("your name is : " + account.getName());
        } else {
            System.out.println("no found account");
        }
    }

    public void depositAccount(double amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("no found account");
        }
    }

    public void withdrawAccount(double amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("No account found");
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

}