public class account {

    private String accountOwnerName;
    private String accountNumber;
    private String creationDate;
    private String accountPassword;
    private double balance;

    

    public account(String accountOwnerName, String accountNumber, String creationDate,String accountPassword, double balance) {
        this.accountOwnerName = accountOwnerName;
        this.accountNumber = accountNumber;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountOwnerName() {
        return accountOwnerName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public String getAccountPassword() {
        return accountPassword;
    }
    public double getBalance() {
        return balance;
    }
    


    public void displayAccountInfo() {
        System.out.println("Account Details:");
        System.out.println("Name: " + this.accountOwnerName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Creation Date: " + this.creationDate);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully.");
        System.out.println("Updated Balance: $" + this.balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
            System.out.println("Updated Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
    
}
