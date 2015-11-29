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
        	Scanner user = new Scanner(System.in);
            
            System.out.println("Enter your desired username:");
            	String Username = user.next();
            
       	 System.out.println("Enter your desired password:");
       	 	String Password = user.next();
       	 
            BufferedWriter writer = null;
            try
            	{
                writer = new BufferedWriter( new FileWriter("user.txt"));
                writer.write(Username);
                writer.write(" ");
                writer.write(Password);
            	}
            catch ( IOException e){}
            finally
            {
                try
                	{
                    if ( writer != null)
                    writer.close( );
                	}
                catch ( IOException e){}
            }

        }else if(i == 2){
        	
        }else if(i == 3){
        	
        }else if(i == 4){
        	
        }else{
        	System.out.println("Invalid selection");
        }
                     
    }
 }
