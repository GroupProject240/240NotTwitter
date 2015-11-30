// Post Info Class File
// Alex Dudley

public class Post
    {
    // public or private
    protected String status;
    // some username
    protected String poster;
    // the actual post, replete with any included hashtags
    protected String message;
    
    Post()
        {
        status = "private";
        poster = "???????";
        message = "?";
        }
    
    public void setStatusAsPublic()
        {
        status = "public";
        }
    
    public void setStatusAsPrivate()
        {
        status = "private";
        }
    
    public void setPoster(String inputPoster)
        {
        poster = inputPoster;
        }
    
    public void setMess(String inputMess)
        {
        message = inputMess;
        }
    
    public String getStatus()
        {
        return status;
        }
    
    public String getPoster()
        {
        return poster;
        }
    
    public String getMess()
        {
        return message;
        }
    }
