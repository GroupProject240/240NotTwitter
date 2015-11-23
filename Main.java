// SilverQuotes Main File
// Alex, Andrew, Marcus, David

public class Main
  {
  
  public static void main(String[] args)
    {
        System.out.println("Welcome to this piece of shit.");
        System.out.println("Press 1 to create a account");
        System.out.println("Press 2 to login into your account");
        System.out.println("Press 3 to do something else that wasnt the last thing");
        System.out.println("Press 4 to fuck off and quit bothering me");
        
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        
        if(i == 1){
            User Jack = new User();
            String usName = CreateUser.createUsername();
            String paWord = CreateUser.createPassword();
            Jack.setUsername(usName);
            Jack.setPassword(paWord);
            Jack.setId(6549872544321L);
            
            System.out.println("Congrats you sad sack of shit! You've created an account!");
            System.out.println("Here are your details below:");
            
            System.out.println("Username: "+Jack.getUsername());
            System.out.println("Password: "+Jack.getPassword());
            System.out.println("Account No.: "+Jack.getId());
            
            
            
        }
        
        
        
        
    }
 }
 
