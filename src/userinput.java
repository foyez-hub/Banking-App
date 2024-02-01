import java.util.Scanner;

public class userinput {
    int choice;
    userinput() {
        
        this.printchoices();

        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);

        this.choice= scanner.nextInt();
    }

    public void printchoices() {

        try {
            // Sleep for 3 seconds (3000 milliseconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
            e.printStackTrace();
        }

        System.out.println("1. Create a new account");
        System.out.println("2. Display all accounts");
        System.out.println("3. Update an account");
        System.out.println("4. Delete an account");
        System.out.println("5. Deposit an amount into your account");
        System.out.println("6. Withdraw an amount from your account");
        System.out.println("7. Search for account");
        System.out.println("8. Exit");

    }

}