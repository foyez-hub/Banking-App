

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

                  newBank.DisplayAllAccount();
                  

                }
                else if(Userinput.choice==8){
                  // code will exit by user input of 8  
                  ck=false;

                }


            
           


            
        }
    }

    
}
