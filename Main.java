// SilverQuotes Main File
// Alex, Andrew, Marcus, David

import java.util.*;
import java.io.*;

public class Main
    {
    public static void main(String[] args)
        {
        final String UPAFile = "UserPasswordPSEUDODATABASE.txt";
        final String PMAFile = "UserPostPSEUDODATABASE.txt";
        UserPasswordAccessor UPA = new UserPasswordAccessor();
        PostMessageAccessor PMA = new PostMessageAccessor();
        UPA.readFile(UPAFile);
        PMA.readFile(PMAFile);
        
        
        System.out.println("Welcome to Silver Quotes!");
        Scanner in = new Scanner(System.in);
        // 'run' necessary to keep while loop running until an error or the Exit command is given
        boolean run = true;
        
        while (run == true)
            {
            System.out.println("(c)reate an account");
            System.out.println("(l)ogin to your account");
            System.out.println("(g)host browse");
            System.out.println("(e)xit Silver Quotes");
            String input = in.nextLine();
    
            if(input.equals("c"))
                {
                String inName;
                String inPass;
                System.out.println("Please input desired username:");
                                
                input = in.nextLine();
                    if(input.contains("~")){
                    System.out.println("Invalid username");
                    input = in.nextLine();
                }
                //"!", "@", "#", "$", "%", "^", "&", "*", " ", ",", "-", "=", "+", "?"
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
            
            if (input.equals("l"))
                {
                System.out.println("Despite being an inherent part of a Twitter Clone, this functionality is unavailable at this time~");
                }
            
            if (input.equals("g"))
                {
                System.out.println("Despite being an inherent part of a Twitter Clone, this functionality is unavailable at this time~");
                }
            
            if (input.equals("e"))
                {
                System.out.println("Thanks for using Silver Quotes, have a wonderful day~");
                run = false;
                }
            else
                {
                System.out.println("Sorry, please enter a valid command~");
                }
            }
        in.close();
        // GOTTA REMEMBER TO REMEMBER WHAT JUST HAPPENED DURING THIS USE OF THE PROGRAM
        UPA.saveToFile(UPAFile);
        PMA.saveToFile(PMAFile);}
    }
