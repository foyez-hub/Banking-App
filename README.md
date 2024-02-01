# Bank Account Management System

A console-based Java application for managing bank accounts, offering various functionalities such as creating accounts, updating information, depositing and withdrawing funds, and more.

## Features

1. *Create a New Account:*
   - Choose the account type (Saving, Salary, Current).
   - Input your name, account creation date, password, and initial deposit amount.
   - Receive feedback on the success or failure of account creation.
## Types of Account:

 ### Saving Account :

- **Minimum Balance Requirement:** A minimum balance of $100 is required to open a Saving Account.
- **Account Type:** The account type is set to "Saving Account."
- **Withdrawal Constraints:** Withdrawals are allowed only if the remaining balance after withdrawal is greater than or equal to the minimum balance.

 ### Salary Account :

- **Minimum Balance Requirement:** No minimum balance is required for a Salary Account.
- **Account Type:** The account type is set to "Salary Account."
- **Withdrawal Constraints:** Withdrawals are allowed as long as the remaining balance after withdrawal is not less than zero.

 ### Current Account :

- **Minimum Balance Requirement:** The initial balance must be greater than or equal to $500 for a Current Account.
- **Account Type:** The account type is set to "Current Account."
- **Withdrawal Constraints:** Withdrawals are allowed only if the remaining balance after withdrawal is greater than or equal to the minimum balance.

2. *Display All Accounts:*
   - View details of all active accounts in the bank.
   - If no accounts are created, a message will be displayed.

3. *Update an Account:*
   - Modify the account's name and password.
   - See the updated account information.

4. *Delete an Account:*
   - Mark an account as deleted, clearing its details.
   - The account number is added to a queue for potential reuse.

5. *Deposit an Amount:*
   - Add funds to your account.
   - Confirm the successful deposit and view the updated balance.

6. *Withdraw an Amount:*
   - Take money out of your account.
   - Confirm the successful withdrawal and view the updated balance.

7. *Search for an Account:*
   - Find an account by providing the account number and password.
   - View the account details if found.

8. *Exit:*
   - Choose option `8` to gracefully exit the application.


## Instructions

### 1. Prerequisites
   - Ensure that you have Java installed on your machine. You can download Java from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Install Git on your machine. Download from: https://git-scm.com/downloads

### 2. Compile the Code
- Download and Run the Application:
  - a. Open a terminal or command prompt.
  - b. Run the following command to clone the repository:
      git clone https://github.com/foyez-hub/Banking-App.git
  - c. Change into the downloaded project directory:
      cd Banking-App
  - d. Compile the Java code:
      javac src/*.java
  - e. Run the application:
      java -cp src App
     

### 3. Run the Program
  - The application will display a menu with options from 1 to 8.
   - Enter the corresponding number for the desired operation and press Enter.

### 4. Menu Options
   - The application will display a menu with options from 1 to 8.
   - Choose an option by entering the corresponding number and pressing Enter.

### 5. Create a New Account
   - Select option `1` to create a new account.
   - Choose the account type (Saving, Salary, Current).
   - Enter your name, account creation date, password, and initial deposit amount.
   - Receive feedback on the success or failure of account creation.

### 6. Display All Accounts
   - Select option `2` to view details of all active accounts.
   - If no accounts are created, a message will be displayed.

### 7. Update an Account
   - Choose option `3` to update an existing account.
   - Enter your account number and password.
   - Follow the prompts to update the account's name and password.

### 8. Delete an Account
   - Select option `4` to delete an existing account.
   - Enter your account number and password.
   - The account will be marked as deleted, and its details cleared.

### 9. Deposit an Amount
   - Choose option `5` to deposit funds into your account.
   - Enter your account number and password.
   - Input the amount you want to deposit.

### 10. Withdraw an Amount
   - Choose option `6` to withdraw funds from your account.
   - Enter your account number and password.
   - Input the amount you want to withdraw.

### 11. Search for an Account
   - Select option `7` to search for an account.
   - Enter your account number and password.
   - If the account is found, its details will be displayed.

### 12. Exit
   - Choose option `8` to gracefully exit the application.


