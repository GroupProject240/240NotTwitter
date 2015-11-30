/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotTwitter;

/**
 *
 * @author Dave
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
public class NotTwitterGUI {

   
    public static void main(String[] args) {
        
        ArrayList <String> usernames = new ArrayList();
        ArrayList <String> passwords = new ArrayList();
        
        /**
         * Creating all JFrames used in the GUI
         */
       
    JFrame main = new JFrame("Welcome to SilverQuotes");
    main.setSize(100, 200);
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JFrame home = new JFrame("User homepage");
    home.setSize(50,50);
    home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JFrame lurk = new JFrame("Ghost Browsing");
    lurk.setSize(50,50);
    lurk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JFrame creator = new JFrame("Account Creation");
    creator.setSize(50,50);
    creator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JFrame stalk = new JFrame("User Profile");
    stalk.setSize(50,50);
    stalk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        /**
         * Creating all JTextFields in the GUI
         */
    
    JTextField StalkPosts = new JTextField(30);
    StalkPosts.setText("insert this person's tweets");
    stalk.add(StalkPosts);
    
    JTextField Instructions = new JTextField(30);
    Instructions.setText("Welcome to SilverQuotes. Do something.");
    main.add(Instructions);
    
    JTextField UserBar = new JTextField(15);
    UserBar.setText("enter username");
    main.add(UserBar);
    
    
    JTextField PassBar = new JTextField(15);
    PassBar.setText("enter password");
    main.add(PassBar);
    
    JTextField stream = new JTextField(20);
    stream.setText("tweetorinos go here");
    home.add(stream);
    
    JTextField explain = new JTextField(20);
    explain.setText("Viewing all public posts");
    lurk.add(explain);
    
    JTextField gstream = new JTextField(20);
    gstream.setText("tweetorinos go here");
    lurk.add(gstream);
    
    JTextField newU = new JTextField(20);
    newU.setText("enter new username");
    creator.add(newU);
    
    JTextField newP = new JTextField(20);
    newP.setText("enter new password");
    creator.add(newP);
    
    JTextField SearchBar = new JTextField(15);
    SearchBar.setText("enter search term");
    home.add(SearchBar);
   
    JTextField PostBar = new JTextField(15);
    SearchBar.setText("enter text to post");
    home.add(PostBar);
        /**
         * Creating all Buttons in the GUI
         */
    
    JButton LoginButton = new JButton("Log in");
    LoginButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event){
            Instructions.setText("insert login sequence");
            String LU = UserBar.getText();
            String LP = PassBar.getText();
            if (usernames.contains(LU)){
               int LUI = usernames.indexOf(LU);
               int LPI = passwords.indexOf(LP);
               if(LUI == LPI){
                    main.setVisible(false);
                    home.setVisible(true);
               }
               if(LUI != LPI){
                   Instructions.setText("invalid login credentials");
               }
            } 
            else{
                Instructions.setText("invalid login credentials");
            }
         }

         
    });
    
    JButton QuitButton = new JButton("Exit");
    QuitButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
            Instructions.setText("Goodbye");
            //insert save function
            System.exit(0);
    }
    });
    
   JButton LurkButton = new JButton("Ghost Browse");
    LurkButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
            Instructions.setText("spooky");
            main.setVisible(false);
            lurk.setVisible(true);
    }
    });
    
    JButton CreationButton = new JButton("Create an Account");
    CreationButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
            Instructions.setText("become one of the horde");
            main.setVisible(false);
            creator.setVisible(true);
    }
    });
    
    JButton LogoutButton = new JButton("Log Out");
    LogoutButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
        //insert logout function
            home.setVisible(false);
            main.setVisible(true);
    }
    });
    
    JButton BackButton = new JButton("Back");
    BackButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
            lurk.setVisible(false);
            main.setVisible(true);
    }
    });
    
    JButton BackButton2 = new JButton("Back");
    BackButton2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
            creator.setVisible(false);
            main.setVisible(true);
    }
    });
    
    JButton BackButton3 = new JButton("Back");
    BackButton3.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
            stalk.setVisible(false);
            main.setVisible(true);
    }
    });
    
     JButton SubscribeButton = new JButton("Subscribe");
    SubscribeButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
           //insert subscribe function
    }
    });
    
    JButton GoButton = new JButton("Create Account");
    GoButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
        String newName = newU.getText();
        String newPass = newP.getText();
        usernames.add(newName);
        passwords.add(newPass);
            creator.setVisible(false);
            home.setVisible(true);
    }
    });
    
    JButton HashSearchButton = new JButton("Search by Hashtag");
    GoButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
       String HashSearch = SearchBar.getText();
       //insert search function
    }
    });
    
    JButton UserSearchButton = new JButton("Search by User");
    GoButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
       String UserSearch = SearchBar.getText();
       //insert search function
    }
    });
    
    JButton POSTButton = new JButton("Post public");
    GoButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
       String newPOST = PostBar.getText();
       //insert post function
    }
    });
    
    JButton postButton = new JButton("Post private");
    GoButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent event2){
       String newpost = PostBar.getText();
       //insert post function
    }
    });
    
    stalk.setLayout(new FlowLayout());
    stalk.add(BackButton3);
    stalk.add(SubscribeButton);
    stalk.pack();
    creator.setLayout(new FlowLayout());
    creator.add(BackButton2);
    creator.add(GoButton);
    creator.pack();
    lurk.setLayout(new FlowLayout());
    lurk.add(BackButton);
    lurk.pack();
    home.setLayout(new FlowLayout());
    home.add(LogoutButton);
    home.add(HashSearchButton);
    home.add(UserSearchButton);
    home.add(POSTButton);
    home.add(postButton);
    home.pack();
    main.setLayout(new FlowLayout());
    main.add(LoginButton);
    main.add(QuitButton);
    main.add(LurkButton);
    main.add(CreationButton);
    main.pack();
    main.setVisible(true);
    }
    
}