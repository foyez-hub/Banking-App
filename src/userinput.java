import java.util.Scanner;


public class userinput {
    

    public void printchoices(){
          

            System.out.println("1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount into your account");
            System.out.println("6. Withdraw an amount from your account");
            System.out.println("7. Search for account");
            System.out.println("8. Exit");

    }

    public void getChoiceInput(){
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
    }

    
}
