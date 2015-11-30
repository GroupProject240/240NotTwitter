// Post Message "Database" Accessor Class File
// Alex Dudley

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class PostMessageAccessor
    {
    protected ArrayList<Post> postInfoList;
    protected int size;
    
    PostMessageAccessor()
        {
        postInfoList = new ArrayList<Post>();
        size = 0;
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
                String[] tokens = currLine.split("~");
                // line of input gets split into tokens 0-2, one for the poster, status, and message, respectively
                
                Post redPost = new Post();
                redPost.setPoster(tokens[0]);
                // needs to determine if status is public or private
                if (tokens[1] == "public")
                    {
                    redPost.setStatusAsPublic();
                    }
                // for the sake of simplicity, we will assume anything written to the file is legit;
                // if it's not public, it's private
                else
                    {
                    redPost.setStatusAsPrivate();
                    }
                redPost.setMess(tokens[2]);
                postInfoList.add(redPost);
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

    
    public boolean saveToFile(String fileName)
        {
        try
            {
            PrintWriter log = new PrintWriter(fileName, "UTF-8");
            for (int i = 0; i < size; i++)
                {
                // Completely renews the file, so the file will even be stored in order
                log.println(postInfoList.get(i).getPoster()+" "+postInfoList.get(i).getStatus()+" "+postInfoList.get(i).getMess());
                }
            log.close();
            return true;
            }
        catch (Exception e)
            {
            // I honestly have no idea how this would happen. The file existed when we opened it up.
            System.out.println("Critical Error in creating UserPostPSEUDODATABASE.txt, contact system administrator to troubleshoot.");
            return false;
            }
        }
    }
