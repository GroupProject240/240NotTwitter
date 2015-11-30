import java.util.ArrayList;

// User Info Class File
// Alex Dudley

public class User
    {
    // username should be more than 5 characters,
    // less than 14 characters,
    // and should use only letters and numbers
    protected String username;
    // password should be more than 6 characters,
    // less than / equal to 20 characters,
    // use any characters but requires numbers
    protected String password;
    protected boolean isGhost;
    protected String ID;
    protected ArrayList<String> subscriptionList;
    protected int sizeSL;
    
    User()
        {
        username = "??????";
        password = "NotARealPassword";
        ID = "0000000";
        isGhost = false;
        sizeSL = 0;
        subscriptionList = new ArrayList<String>();
        }
    
    public void ghostBrowse()
        {
        username = "Napstablookster";
        password = "JustAGhostlyPassword";
        ID = "SPOOOPY";
        isGhost = true;
        subscriptionList.clear();
        sizeSL = 0;
        }
    
    public void reset()
        {
        username = "??????";
        password = "NotARealPassword";
        ID = "0000000";
        isGhost = false;
        subscriptionList.clear();
        sizeSL = 0;
        }
    
    public void setUserName(String inputName)
        {
        username = inputName;
        }
    
    public void setPassword(String inputPass)
        {
        password = inputPass;
        }
    
    public void setID(String inputID)
        {
        ID = inputID;
        }
    
    public void setSubscriptions(String subsToParse)
        {
        String[] tokens = subsToParse.split("~");
        sizeSL = tokens.length;
        // We only want to add things to this list if they have subscriptions, ### means they have none
        if (tokens[0].equals("###") == false)
            {
            for (int i = 0; i < sizeSL; i++)
                {
                subscriptionList.add(tokens[i]);
                // We don't need to increase the size of the list, because it's already done before the for loop even starts
                }
            }
        }
    
    public void addSubscription(String otherUser)
        {
        subscriptionList.add(otherUser);
        sizeSL = sizeSL+1;
        }
    
    public String getUserName()
        {
        return username;
        }
    
    public String getPassword()
        {
        return password;
        }
    
    public String getID()
        {
        return ID;
        }
    
    public ArrayList<String> getSubscriptions()
        {
        return subscriptionList;
        }
    }
