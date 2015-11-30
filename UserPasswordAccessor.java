// User Password "Database" Accessor Class File
// Alex Dudley

import java.io.*;
import java.util.*;

public class UserPasswordAccessor
    {
    protected ArrayList<User> userInfoList;
    protected int sizeUFL;
    
    UserPasswordAccessor()
        {
        sizeUFL = 0;
        userInfoList = new ArrayList<User>();
        }
    
    public boolean readFile(String fileName)
        {
        try
            {
            System.out.println("Hello there~");
            FileInputStream fStream = new FileInputStream(fileName);
            DataInputStream in = new DataInputStream(fStream);
            BufferedReader buffRed = new BufferedReader(new InputStreamReader(in));
            String currLine;
            while ((currLine = buffRed.readLine()) != null)
                {
                String[] tokens = currLine.split(" ");
                // line of input gets split into tokens 0-3, one for username, password, ID, and subscriptions, respectively
                
                User redUser = new User();
                redUser.setUserName(tokens[0]);
                redUser.setPassword(tokens[1]);
                redUser.setID(tokens[2]);
                redUser.setSubscriptions(tokens[3]);
                userInfoList.add(redUser);
                sizeUFL = sizeUFL+1;
                }
            in.close();
            System.out.println("Goobii~");
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
        sizeUFL = sizeUFL+1;
        }
    
    public boolean saveToFile(String fileName)
        {
        try
            {
            PrintWriter log = new PrintWriter(fileName, "UTF-8");
            for (int i = 0; i < sizeUFL; i++)
                {
                // Completely renews the file, so the file will even be stored in order
                // need to create string that has all subscriptions, appropriately demarcated
                
                // need to make the subscription part to add to file
                // if they have none, will simply write ###, else will create subscription signifier
                String subString = "";
                if (userInfoList.get(i).hasNoSubs() == true)
                    {
                    subString = "###";
                    }
                else
                    {
                    ArrayList<String> tempSubList = userInfoList.get(i).getSubscriptions();
                    for (int j = 0; j < sizeUFL; j++)
                        {
                        // adds subscription username to what's being added to string
                        subString.concat(tempSubList.get(j));
                        if (j != sizeUFL)
                            {
                            // only adds this ~ delimiter if there are more subscriptions to be added
                            subString.concat("~");
                            }
                        }
                    }
                log.println(userInfoList.get(i).getUserName()+" "+userInfoList.get(i).getPassword()+" "+userInfoList.get(i).getID()+" "+subString);
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
