import java.util.Scanner;

public class BankApplication {
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the bankingSystem");

        while (true) {
            System.out.println("1: add account");
            System.out.println("2: deposit amount");
            System.out.println("3: withdraw amount");
            System.out.println("4: display your data");
            System.out.println("5: exit");
            System.out.println("Please enter your choice : ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAccount(scanner);
                    break;
                case 2:
                    depositAccount(scanner);
                    break;
                case 3:
                    withdrawAccount(scanner);
                    break;
                case 4:
                    String acc = scanner.nextLine();
                    scanner.nextLine();
                    bank.displayAccount(acc);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }

    private static void withdrawAccount(Scanner scanner) {
        String accNum = scanner.nextLine();
        scanner.nextLine();
        double amt = scanner.nextDouble();
        bank.withdrawAccount(amt, accNum);
    }

    private static void depositAccount(Scanner scanner) {
        String accountNum = scanner.nextLine();
        scanner.nextLine();
        double amount = scanner.nextDouble();
        bank.depositAccount(amount, accountNum);
    }

    private static void addAccount(Scanner scanner) {
        System.out.println("Please enter your AccountNumber : ");
        String accountNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Please enter your Name : ");
        String name = scanner.nextLine();
        System.out.println("Please enter your Balance : ");
        double balance = scanner.nextDouble();
        Account account = new Account(accountNumber, name, balance);
        bank.addAccount(account);
    }
}