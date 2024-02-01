import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Bank {
    private ArrayList<account> accounts;
    Queue<Integer> DeletedAccounts = new LinkedList<>();

    private Scanner scanner;

    public ArrayList<account> getAccounts() {
        return accounts;
    }

    public Bank() {
        this.accounts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void createAccount() {
        int type = 0;
        System.out.println("---------------------------------");

        System.out.println("Select your Account type: ");
        System.out.println("1.Saving  Account");
        System.out.println("2.Salary Account");
        System.out.println("3.Current  Account");

        System.out.println("---------------------------------\n");

        System.out.println("Enter Your option (eg.1 )");
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for account type. Please enter a valid option.");
            return;
        }

        System.out.println("Enter account owner name: ");
        String name = scanner.nextLine();

        System.out.println("Enter account creation date (format -> [day-month-year] , eg-> 1-2-24 ) : ");
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

        account newAccount = new account(name, -1, creationDate, password, 0);
        // account number is negetive -1 means account is not created yet
        if (type == 1) {

            newAccount = new SavingAccount(name, -1, creationDate, password, initialDeposit);

        } else if (type == 2) {
            newAccount = new SalaryAccount(name, -1, creationDate, password, initialDeposit);

        } else if (type == 3) {
            newAccount = new CurrentAccount(name, -1, creationDate, password, initialDeposit);

        }

        // isAccountCreated method by defult return false if account is not created
        // account will not create if it does not met the requirement of minimum balance

        if (newAccount.isAccountCreated()) {

            int accountnum = accounts.size() + 1;
            if (DeletedAccounts.size() >= 1) {
                // chechking is there any account in the DeletedAccounts queue

                accountnum = DeletedAccounts.peek();

                account obj = accounts.get(accountnum - 1);
                obj.setAccountOwnerName(newAccount.getAccountOwnerName());
                obj.setBalance(newAccount.getBalance());
                obj.setAccountPassword(newAccount.getAccountPassword());
                obj.setisAccountCreated(newAccount.isAccountCreated());
                obj.setCreationDate(newAccount.getCreationDate());

                DeletedAccounts.remove();

            } else {
                newAccount.setAccountNumber(accountnum);

                accounts.add(newAccount);

            }

            // when all requiement met account number will be given
            // first-> new account number will be given to the old accounts number which
            // accounts are deleted
            // if there is no deleted accounts left in the DeletedAccounts Queue then
            // array list size +1 will be new account number

            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account creation failed");
        }

    }

    public void displayAllAccounts() {
        boolean ck = false;
        for (account account : accounts) {
            if (account.isAccountCreated()) {
                account.displayAccountInfo();
                ck = true;
            }
        }

        if (!ck)
          System.out.println("---------------------------------\n");

            System.out.println("There is no account created yet");
    }

    public void updateAccount() {

        System.out.println("Enter your account number");
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for account number. Please enter a valid number.");
            return;
        }

        System.out.println("Enter your account password");
        String accountPassword = scanner.nextLine();

       
        if (this.isAccountValid(accountNumber, accountPassword)) {
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                accounts.get(accountNumber-1) .setAccountOwnerName(newName);

                System.out.println("Enter new password: ");
                String newPassword = scanner.nextLine();
                accounts.get(accountNumber-1).setAccountPassword(newPassword);

                System.out.println("---------------------------------------\n");

                System.out.println("Updated Information->");
                accounts.get(accountNumber-1).displayAccountInfo();

                System.out.println("\n---------------------------------------");



        }
        else{
            System.out.println("Enter valid account number or password");
        }
    }

    public void DeleteAccount() {

        System.out.println("Enter your account number");
        int accountNumber;

        try {
            accountNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for account number. Please enter a valid number.");
            return;
        }

        System.out.println("Enter your account password");
        String accountPassword = scanner.nextLine();

        if (this.isAccountValid(accountNumber, accountPassword)) {

            account obj = accounts.get(accountNumber - 1);
            obj.setAccountOwnerName("");
            obj.setBalance(0.0);
            obj.setAccountPassword("");
            obj.setisAccountCreated(false);
            obj.setCreationDate("");

            DeletedAccounts.add(accountNumber);

            System.out.println("\n -----------------------");

            System.out.println("\n Your account Deleted");

            System.out.println("\n -----------------------");

        } else {
            System.out.println("\n Wrong  Password or Account does not exist");
        }

    }

    public void AccountDeposit() {

        System.out.println("Enter your account number");
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for account number. Please enter a valid number.");
            return;
        }

        System.out.println("Enter your account password");
        String accountPassword = scanner.nextLine();

        if (this.isAccountValid(accountNumber, accountPassword)) {
            System.out.println("Enter amount you want to deposit ");
            double DepositAmmount = scanner.nextDouble();
            accounts.get(accountNumber - 1).deposit(DepositAmmount);
        } else {
            System.out.println("Account not Found..");
        }

    }

    public void AccountWithdraw() {

        System.out.println("Enter your account number");
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for account number. Please enter a valid number.");
            return;
        }
        
        scanner.nextLine();

        System.out.println("Enter your account password");
        String accountPassword = scanner.nextLine();

        if (this.isAccountValid(accountNumber, accountPassword)) {
            System.out.println("Enter amount you want to withdraw ");
            double WithdrawAmmount = scanner.nextDouble();
            accounts.get(accountNumber - 1).withdraw(WithdrawAmmount);
        } else {
            System.out.println("Account not Found..");
        }

    }

    public void SearchAccount() {

        System.out.println("Enter your account number");
        int accountNumber;
        try {
            accountNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for account number. Please enter a valid number.");
            return;
        }

        System.out.println("Enter your account password");
        String accountPassword = scanner.nextLine();

        if (this.isAccountValid(accountNumber, accountPassword)) {
            System.out.println("Account Found..");

            System.out.println("----------------------------------------");
            accounts.get(accountNumber - 1).displayAccountInfo();
            System.out.println("----------------------------------------");

        } else {
            System.out.println("Account not Found..");
        }

    }

    public boolean isAccountValid(int accountNumber, String accountPassword) {
        return accountNumber <= accounts.size() && accounts.get(accountNumber - 1).isAccountCreated()
                && accounts.get(accountNumber - 1).getAccountPassword().equals(accountPassword);

    }

    public void closeScanner() {
        scanner.close();
    }
}
