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
public class CreateUser {
    
    public static String createUsername(String User) {
    
   
     String Username = User;
     
     System.out.println(Username + " will be your username for the system.");
     
       try{ 
        String line = null;
        Character let;
        
        
       String Userpath = "account.txt";
       String Spacer = "\n";
        
        String contentsToWrite = Username;
        OutputStream outStream = new FileOutputStream(Userpath, true);
        outStream.write(Spacer.getBytes());
        outStream.write(contentsToWrite.getBytes());
        outStream.close();
        
       }
       catch(IOException e){
           System.out.println("Sorry, something went wrong. We're working on it tho!");
       }
     
     
     return Username;
}
    
     public static String createPassword() {
        
     Scanner user = new Scanner(System.in);
     
     System.out.println("Enter your desired password:");
     
     String Password= user.next();
     
     System.out.println(Password + " will be your password for the system. DO NOT fucking forget it");
     
     try{ 
        String line = null;
        Character let;
        
        
        String Passpath = "password.txt";
        String Spacer = "\n";
 
        String contentsToWrite = Password;
        OutputStream outStream = new FileOutputStream(Passpath, true);
        outStream.write(Spacer.getBytes());
        outStream.write(contentsToWrite.getBytes());
        outStream.close();
        
       }
       catch(IOException e){
           System.out.println("Sorry, something went wrong. We're working on it tho!");
       }
     
     return Password;
}
    
     public static String createUserID(){
         
         String uniqueID = UUID.randomUUID().toString();
         try{
             
    
            String AccIDPath = "accountID.txt";
            String Spacer = "\n";

            String contentsToWrite = uniqueID;
            OutputStream outStream = new FileOutputStream(AccIDPath, true);
            outStream.write(Spacer.getBytes());
            outStream.write(contentsToWrite.getBytes());
            outStream.close();
        
        
        }
         catch(IOException e){
             System.out.println("Sorry, something went wrong. We're working on it tho!");
         }
         
         return uniqueID;
     }
    
    
}
