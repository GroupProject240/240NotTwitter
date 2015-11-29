// SilverQuotes Main File
// Alex, Andrew, Marcus, David

public class Main
  {
  
    public static void main(String[] args) {
        
    
        ArrayList<String>Accounts = new ArrayList<>();
        ArrayList<String>Passwords = new ArrayList<>();
        ArrayList<String>AccountID = new ArrayList<>();
           
        
      System.out.println("**Loading existing accounts...**");
       
      AccLoad.loadAccount(Accounts);
      AccLoad.loadPassword(Passwords);
      AccLoad.loadAccountID(AccountID);
      
        
       
        System.out.println("**Operation Complete.**");

            System.out.println(Accounts);
            System.out.println(Passwords);
            System.out.println(AccountID);
            
         int i = 0;
 
    while(i != 4 ){   
        try{
        System.out.println("Welcome to SilverQuotes.");
        System.out.println("Press 1 to create a account");
        System.out.println("Press 2 to login into your account");
        System.out.println("Press 3 to Ghost Browse");
        System.out.println("Press 4 quit");
        
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        Random IDgen = new Random();
        
        
        if(i == 1){
            System.out.println("Welcome to the Account Regristration Process.\n\n");
            System.out.println("Please enter your desired username:");
            String Username = in.next();
            User Jack = new User();
            String usName = CreateUser.createUsername(Username);
            String paWord = CreateUser.createPassword();
            String UUID = CreateUser.createUserID();
            Jack.setUsername(usName);
            Jack.setPassword(paWord);

            
            System.out.println("Congrats! You've created an account!");
            System.out.println("Here are your details below:");
            
            System.out.println("Username: "+usName);
            System.out.println("Password: "+paWord);
            System.out.println("Account No.: "+UUID);
            
            AccLoad.loadAccount(Accounts);
            AccLoad.loadPassword(Passwords);
            AccLoad.loadAccountID(AccountID);
            
            
            
        }
        
        if(i == 2){
            boolean login = AccLogin.Login(Accounts, Passwords, AccountID);
            
            if(login == true){
            System.out.println("**Login Successful.**");
            System.out.println("***Loading...***\n\n");
            ///Start Program
            
            }
            else{
                
            }
        }
        
    }
        catch(InputMismatchException e){
            System.out.println("Sorry, I didn't quite catch that. Please try again. \n\n");
        }
    }
        
    }
    
}
