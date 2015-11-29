// User Info Class File
// Alex Dudley

public class User
    {
    // username should be more than 5 characters,
    // less than / equal to 13 characters,
    // and should use letters and numbers
    protected String username;
    // password should be more than 6 characters,
    // less than / equal to 20 characters,
    // use any characters but requires numbers
    protected String password;
    protected boolean isGhost;
    protected String ID;
    
    User()
        {
        username = "??????";
        password = "NotARealPassword";
        ID = "0000000";
        isGhost = false;
        }
    
    public void ghostBrowse()
        {
        username = "Napstablookster";
        password = "JustAGhostlyPassword";
        ID = "SPOOOPY";
        isGhost = true;
        }
    
    public void reset()
        {
        username = "??????";
        password = "NotARealPassword";
        ID = "0000000";
        isGhost = false;
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
    }
