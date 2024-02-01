public class account {

    private String accountOwnerName;
    private String accountNumber;
    private String creationDate;
    private String accountPassword;
    private double balance;
    private String accountType;
    private boolean isAccountCreated=false;

    

   

   

    public account(String accountOwnerName, String accountNumber, String creationDate,String accountPassword, double balance) {
        this.accountOwnerName = accountOwnerName;
        this.accountNumber = accountNumber;
        this.creationDate = creationDate;
        this.balance = balance;
        this.accountPassword=accountPassword;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
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

    public boolean isAccountCreated() {
        return isAccountCreated;
    }

    public void setisAccountCreated(boolean isAccountCreated) {
        this.isAccountCreated = isAccountCreated;
    }
    


    public void displayAccountInfo() {

        System.out.println("Account Details:");
        System.out.println("Account type: " + this.accountType);
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


// SavingAccount class
class SavingAccount extends account {

    private static final double MINIMUM_BALANCE = 100.0;

    public SavingAccount(String accountOwnerName, String accountNumber, String creationDate, String accountPassword, double balance) {
        super(accountOwnerName, accountNumber, creationDate, accountPassword, balance);
        if (balance < MINIMUM_BALANCE) {
            System.out.println("Minimum balance of $" + MINIMUM_BALANCE + " required to open a Saving Account.");
        }
        else{
            super.setisAccountCreated(true);
            super.setAccountType("Saving Account");


        }
        
        
    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance requirement not met.");
        }
    }

    public static double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    


}

// SalaryAccount class
class SalaryAccount extends account {

    private static final double MINIMUM_BALANCE = 0.0; 

    public SalaryAccount(String accountOwnerName, String accountNumber, String creationDate, String accountPassword, double balance) {
        super(accountOwnerName, accountNumber, creationDate, accountPassword, balance);
        super.setAccountType("Salary Account");
        super.setisAccountCreated(true);

    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance requirement not met.");
        }
    }

    public static double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }


}

// CurrentAccount class
 class CurrentAccount extends account {

    private static final double MINIMUM_BALANCE = 500.0; 

   

    public CurrentAccount(String accountOwnerName, String accountNumber, String creationDate, String accountPassword, double balance) {
        super(accountOwnerName, accountNumber, creationDate, accountPassword, balance);
        if (balance < MINIMUM_BALANCE) {
            System.out.println("Initial balance must be greater than or equal to  $" + MINIMUM_BALANCE + " for a Current Account.");
        }else{
        super.setAccountType("Current Account");
        super.setisAccountCreated(true);


        }

    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance requirement not met.");
        }

    } 

    public static double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }


    

    

}





