/**
 *
 * @author mdavis5
 */

import java.util.*;
import java.io.*;

public class AccLogin {
    
     public static boolean Login(ArrayList<String> Accounts, ArrayList<String> Passwords, ArrayList<String> AccountID){
        
        boolean success = false;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter your Username: ");
        try{
        String i = in.next();
        AccSearch:
        for(int p = 0; p < Passwords.size();p++){
           String check = Accounts.get(p);
           if(check.equals(i)){
               System.out.println("Welcome, "+i+". Please enter your password: ");
               
             while(success != true){
                   int c = 0;
                   if(c == 4){
                       System.out.println("Too Many Password Attempts. Please Check your Password and try again.");
                       success = false;
      
                   }
               String x = in.next();
                    
               String checkpass = Passwords.get(p);
               if(checkpass.equals(x)){
                   String ID = AccountID.get(p);
                   
                   System.out.println("Login Successful. .Welcome, "+check+"!  Account ID: "+ID+"\n\n");
                   success = true;
                   break AccSearch;
               }
               else{
                   
                   System.out.println("Incorrect Password. Please try again./n");
                   c++;
                   
               }
               
               }
               
              
          
           }
           if(p==Passwords.size()-1){
               System.out.println("Sorry, I couldn't find your username. Please try again.");
               System.out.println("***Exiting Login...***\n\n");
               success = false;
               break;
           }
          
       }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("*******\n");
            return success;
        }
     
        return success;
        
     }

}    
    
     
 