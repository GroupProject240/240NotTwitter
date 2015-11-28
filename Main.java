// SilverQuotes Main File
// Alex, Andrew, Marcus, David

import java.io.*;
import java.util.*;

public class Main
  {
  
  public static void main(String[] args)
    {
	  	 
        System.out.println("Welcome to SilverQuotes");
        System.out.println("Press 1 to create a account");
        System.out.println("Press 2 to login into your account");
        System.out.println("Press 3 to Ghost Browse");
        System.out.println("Press 4 to quit");
        
        Scanner in = new Scanner(System.in);
        
        int i = in.nextInt();
        
        if(i == 1){
            User Jack = new User();
            String usName = CreateUser.createUsername();
            String paWord = CreateUser.createPassword();
            Jack.setUsername(usName);
            Jack.setPassword(paWord);
            String uniqueID = UUID.randomUUID().toString();
            Jack.setId(uniqueID);
            
            System.out.println("You've created an account!");
            System.out.println("Here are your details below:");
            
            System.out.println("Username: "+Jack.getUsername());
            System.out.println("Password: "+Jack.getPassword());
            System.out.println("Account No.: "+Jack.getId());
            
            
            
        }
        return;                
    }
 }
