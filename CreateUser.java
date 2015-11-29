import java.io.*;
import java.util.*;
/**
 *
 * @author mdavis5
 */
public class CreateUser {
    
    public static String createUsername() {
     
     Scanner user = new Scanner(System.in);
     
     System.out.println("Enter your desired username:");
     String Username = user.next();
     
     System.out.println(Username + " will be your username for the system.");
          
     return Username;
    }
    
     public static String createPassword() {     
    	 Scanner user = new Scanner(System.in);
     
    	 System.out.println("Enter your desired password:");
    	 String Password= user.next();
    	 System.out.println(Password + " will be your password for the system.");
     
     return Password;
     }    
}
