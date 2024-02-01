import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<account> accounts;
    private Scanner scanner;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void createAccount() {
        double minimumBalance = 500;

        System.out.println("Enter account owner name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        String accountNumber = String.valueOf(accounts.size() + 1);

        System.out.println("Enter account creation date: ");
        String creationDate = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Enter initial deposit amount: ");
        double initialDeposit;
        
        try {
            initialDeposit = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for initial deposit. Please enter a valid amount.");
            return;
        }

        if (initialDeposit < minimumBalance) {
            System.out.println("Initial deposit must be at least $" + minimumBalance);
            System.out.println("Account creation failed");
            return;
        }

        account newAccount = new account(name, accountNumber, creationDate, password, initialDeposit);
        accounts.add(newAccount);

        System.out.println("Account created successfully.");
        newAccount.displayAccountInfo();
    }

    public void displayAllAccounts() {
        for (account account : accounts) {
            account.displayAccountInfo();
        }
    }

    public void updateAccount() {
        System.out.println("Enter your account number");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter your account password");
        String accountPassword = scanner.nextLine();

        boolean accountFound = false;

        for (account account : accounts) {
            if (account.getAccountPassword().equals(accountPassword) && account.getAccountNumber().equals(accountNumber)) {
                accountFound = true;

                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                account.setAccountOwnerName(newName);

                System.out.println("Enter new password: ");
                String newPassword = scanner.nextLine();
                account.setAccountPassword(newPassword);

                System.out.println("Updated Information->");
                account.displayAccountInfo();

                break; // Break out of the loop once the account is found and updated
            }
        }

        if (!accountFound) {
            System.out.println("Enter valid account number or password");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
