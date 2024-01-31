import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<account> accounts;

    
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount() {

        

        double minimumBalance =500;
        // 500 is  minimum balance to open a account

        System.out.println("Enter account owner name: ");
        String name = scanner.nextLine();

        String accountNumber = String.valueOf(accounts.size() + 1);

        System.out.println("Enter account creation date: ");
        String creationDate = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        

        System.out.println("Enter initial deposit amount: ");
       double initialDeposit = scanner.nextDouble();

        if (initialDeposit < minimumBalance) {

            
            System.out.println("Initial deposit must be at least $" + minimumBalance);
            System.out.println("Account creation failed");

            return;           

        }
       

        account newAccount = new account(name, accountNumber, creationDate, password,initialDeposit);
        accounts.add(newAccount);

        System.out.println("Account created successfully.");
        newAccount.displayAccountInfo();
        return;
    }

    public void DisplayAllAccount(){

        for (account account : accounts) {
            account.displayAccountInfo();
            
        }

    }



   
    
}
