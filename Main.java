// SilverQuotes Main File
// Alex, Andrew, Marcus, David

import java.util.*;

public class Main
    {
    public static void main(String[] args)
        {
        UserPasswordAccessor UPA = new UserPasswordAccessor();
        PostMessageAccessor PMA = new PostMessageAccessor();
        
        System.out.println("Welcome to Silver Quotes!");
        Scanner in = new Scanner(System.in);
        // 'run' necessary to keep while loop running until an error or the Exit command is given
        boolean run = true;
        
        while (run == true)
            {
            System.out.println("(C)reate an account");
            System.out.println("(L)ogin to your account");
            System.out.println("(G)host browse");
            System.out.println("(E)xit Silver Quotes");
            String input = in.nextLine();
    
            if(input == "C")
                {
                String inName;
                String inPass;
                System.out.println("Please input desired username:");
                
                input = in.nextLine();
                // need to make sure input for username is alphanumeric, within size requirements,
                // and is not already in use
                inName = input;
                System.out.println("Please input desired password:");
                input = in.nextLine();
                // need to make sure password meets requirements
                inPass = input;
                
                // User does not give account ID, is randomly generated
                // create new user, assign variable values
                User nUser = new User();
                nUser.setUserName(inName);
                nUser.setPassword(inPass);
                // For now, it will set ID to '1111111'
                nUser.setID("1111111");
                UPA.addAccount(nUser);
                
                System.out.println("Congratulations! You've created an account!");
                System.out.println("Here are the details of the newly made account:");
                System.out.println("Username: "+nUser.getUserName());
                System.out.println("Password: "+nUser.getPassword());
                System.out.println("Account No.: "+nUser.getID());
                }
            
            if (input == "L")
                {
                System.out.println("Despite being an inherent part of a Twitter Clone, this functionality is unavailable at this time~");
                }
            
            if (input == "G")
                {
                System.out.println("Despite being an inherent part of a Twitter Clone, this functionality is unavailable at this time~");
                }
            
            if (input == "E")
                {
                System.out.println("Thanks for using Silver Quotes, have a wonderful day~");
                run = false;
                }
            }
        in.close();
        }
    }
