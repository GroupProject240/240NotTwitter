/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtwitterdude;
import java.io.*;
import java.util.*;

/**
 *
 * @author mdavis5
 */
public class TestTwitterdude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        ArrayList<String>Accounts = new ArrayList<>();
        ArrayList<String>Passwords = new ArrayList<>();
        ArrayList<Long>AccountID = new ArrayList<>();
           
        
      System.out.println("**Loading existing accounts...**");
       
      AccLoad.loadAccount(Accounts);
      AccLoad.loadPassword(Passwords);
      AccLoad.loadAccountID(AccountID);
      
        
       
        System.out.println("**Operation Complete.**");

            System.out.println(Accounts);
            System.out.println(Passwords);
            System.out.println(AccountID);
 
        
        System.out.println("Welcome to this piece of shit.");
        
          
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        Random IDgen = new Random();
        
        
        while(i != 4);{
        
    
        System.out.println("Press 1 to create a account");
        System.out.println("Press 2 to login into your account");
        System.out.println("Press 3 to do something else that wasnt the last thing");
        System.out.println("Press 4 to fuck off and quit bothering me");
      
        
        if(i == 1){
            System.out.println("Welcome to the Account Regristration Process./n/n");
            System.out.println("Please enter your desired username:");
            String Username = in.next();
            User Jack = new User();
            String usName = CreateUser.createUsername(Username);
            String paWord = CreateUser.createPassword();
            Jack.setUsername(usName);
            Jack.setPassword(paWord);

            Jack.setId(6549872544321L);
            
            System.out.println("Congrats you sad sack of shit! You've created an account!");
            System.out.println("Here are your details below:");
            
            System.out.println("Username: "+Jack.getUsername());
            System.out.println("Password: "+Jack.getPassword());
            System.out.println("Account No.: "+Jack.getId());
            
            if(i == 2){
                Login.Login();
                
            }
            
            
            
        }
    }
        
        
        
        
    }
    
}
