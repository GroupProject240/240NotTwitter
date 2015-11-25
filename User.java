/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtwitterdude;

/**
 *
 * @author mdavis5
 */
public class User {
    private Long id;
    protected String username;
    private String password;
    
    

    
    public Long getId() 
        {
            return id;
	}

	public void setId(Long id) 
        {
            this.id = id;
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