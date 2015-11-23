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
    
    public static String createUsername() {
    
     System.out.println("Alright then motherfucker:");
     
     Scanner user = new Scanner(System.in);
     
     System.out.println("Enter your desired username:");
     
     String Username = user.next();
     
     System.out.println(Username + " will be your username for the system.");
     
     
     return Username;
}
    
     public static String createPassword() {
    
     System.out.println("Step two bitch:");
     
     Scanner user = new Scanner(System.in);
     
     System.out.println("Enter your desired password:");
     
     String Password= user.next();
     
     System.out.println(Password + " will be your password for the system. DO NOT fucking forget it");
     
     return Password;
}
    
    
    
}
