import java.util.*;
public class Tweet {
    
    private final List<String> hashtags = new ArrayList<String>();
    
    private String text;
    
    private Tweet() {}
    
    public static Tweet getTweet(String tweetText) {
        Tweet tweet = new Tweet();
        tweet.text = tweetText;
        tweet.parse();
        return tweet;
    }
    
    private void parse() {
        StringTokenizer tokenizer = new StringTokenizer(this.text);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.startsWith("#")) {
                hashtags.add(token);
            }
        }
    }
    
    public Set<String> getUniqueHashtags() {
        Set<String> unique = new HashSet<String>();
        unique.addAll(hashtags);
        return unique;
    }
}
