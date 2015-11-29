// User Password "Database" Accessor Class File
// Alex Dudley

import java.io.*;
import java.util.*;

public class UserPasswordAccessor
    {
    protected ArrayList<User> userInfoList;
    
    public boolean readPseudoDatabase(String fileName)
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
        }
    }
