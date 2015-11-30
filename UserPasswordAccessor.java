// User Password "Database" Accessor Class File
// Alex Dudley

import java.io.*;
import java.util.*;

public class UserPasswordAccessor
    {
    protected ArrayList<User> userInfoList;
    int size;
    
    UserPasswordAccessor()
        {
        size = 0;
        userInfoList = new ArrayList<User>();
        }
    
    public boolean readFile(String fileName)
        {
        try
            {
            FileInputStream fStream = new FileInputStream(fileName);
            DataInputStream in = new DataInputStream(fStream);
            BufferedReader buffRed = new BufferedReader(new InputStreamReader(in));
            String currLine;
            while ((currLine = buffRed.readLine()) != null)
                {
                String[] tokens = currLine.split(" ");
                // line of input gets split into tokens 0-2, one for username, password, and ID, respectively
                
                User redUser = new User();
                redUser.setUserName(tokens[0]);
                redUser.setPassword(tokens[1]);
                redUser.setID(tokens[2]);
                userInfoList.add(redUser);
                size = size+1;
                }
            in.close();
            return true;
            }
            
        catch (Exception e)
            {
            System.err.println("Error accessing username-password, um, database(?), please contact admin to check for database(?) location");
            return false;
            }
        }
    
    public void addAccount(User nUser)
        {
        userInfoList.add(nUser);
        size = size+1;
        }
    
    public boolean saveToFile(String fileName)
        {
        try
            {
            PrintWriter log = new PrintWriter(fileName, "UTF-8");
            for (int i = 0; i < size; i++)
                {
                // Completely renews the file, so the file will even be stored in order
                log.println(userInfoList.get(i).getUserName()+" "+userInfoList.get(i).getPassword()+" "+userInfoList.get(i).getID());
                }
            log.close();
            return true;
            }
        catch (Exception e)
            {
            // I honestly have no idea how this would happen. The file existed when we opened it up.
            System.out.println("Critical Error in creating UserPasswordPSEUDODATABASE.txt, contact system administrator to troubleshoot.");
            return false;
            }
        }
    }
