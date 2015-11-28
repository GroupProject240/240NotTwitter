public class User {
    private String id;
    protected String username;
    private String password;
    
    
    public String getId() 
        {
            return id;
	}

	public void setId(String uniqueID) 
        {
            this.id = uniqueID;
      	}

	public String getPassword() 
        {
            return password;
      	}

	public void setPassword(String password) 
        {
            this.password = password;
      	}

	public String getUsername() 
        {
            return username;
      	}

	public void setUsername(String username) 
        {
            this.username = username;
      	}
}
