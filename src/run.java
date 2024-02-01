public class run {

   public run(){
        boolean ck=true;
        Bank newBank=new Bank();

        while (ck) {

            userinput Userinput=new userinput();
                if(Userinput.choice==1){
                // it will create new a account  
                  newBank.createAccount(); 
                }
                else if(Userinput.choice==2){
                  newBank.displayAllAccounts();
                }
                else if(Userinput.choice==3){
                  newBank.updateAccount();

                }
                else if(Userinput.choice==4){
                  newBank.DeleteAccount();
                }
                else if(Userinput.choice==5){
                  newBank.AccountDeposit();

                }
                else if(Userinput.choice==6){
                 newBank.AccountWithdraw();
                }
                else if(Userinput.choice==7){
                  // newBank.updateAccount();
                }
                else if(Userinput.choice==8){
                  ck=false;

                }
        }

        newBank.closeScanner();

    }

    
}
