/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtwitterdude;
import java.util.*;
import java.io.*;

/**
 *
 * @author mdavis5
 */
public class AccLoad {
    
    public static void loadAccount(ArrayList<String> Accounts){
        
        File accounts = new File("account.txt");
        String accountFile = "account.txt";
        
        Character let;
        String line;
        int Linenum = 0 ;
        
        ///Usernames
        try{
            FileReader fileReader =
                    new FileReader(accounts);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                        while((line = bufferedReader.readLine()) !=null) {
                                String ACC = line;
                                Accounts.add(line);
                                Linenum++;
                        }
            }
            catch(IOException e){
                System.out.println("*Error in operation. Maybe the file is missing/corrupted?*");
            }
            
        }
        catch(IOException e){
            System.out.println("*Error in operation. Maybe the file is missing/corrupted?*");
        }
        
        
        
    }
    
    public static void loadPassword(ArrayList<String> Passwords){
        
        File passwords = new File("password.txt");
        String passwordFile = "password.txt";
        
        Character let;
        String line;
        int Linenum = 0 ;
        
         ////Passwords
        try{
            FileReader fileReader =
                    new FileReader(passwords);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                        while((line = bufferedReader.readLine()) !=null) {
                                String PASS = line;
                                Passwords.add(line);
                                Linenum++;
                        }
            }
            catch(IOException e){
                System.out.println("*Error in operation. Maybe the file is missing/corrupted?*");
            }
            
        }
        catch(IOException e){
            System.out.println("*Error in operation. Maybe the file is missing/corrupted?*");
        }
    }
    
    public static void loadAccountID(ArrayList<String> AccountID){
        
        File accountID = new File("accountID.txt");
        String accIDFile = "accountID.txt";
        
        Character let;
        String line;
        int Linenum = 0 ;
        
         /////Account ID Numbers
        try{
            FileReader fileReader =
                    new FileReader(accountID);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                        while((line = bufferedReader.readLine()) !=null) {
                                String IDN = line;
                                AccountID.add(IDN);
                                Linenum++;
                        }
            }
            catch(IOException e){
                System.out.println("*Error in operation. Maybe the file is missing/corrupted?*");
            }
            
        }
        catch(IOException e){
            System.out.println("*Error in operation. Maybe the file is missing/corrupted?*");
        }
                                
    }
}

