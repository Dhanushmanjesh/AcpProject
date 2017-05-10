/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import database.DataBase;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sohail
 */
public class Admin extends JFrame{
    
    private String userName;
    
    private String password;
    
    
    public Admin()
    {
     initUI();
    }
    
    private void initUI()
    {
     
        setBounds(0, 0, 900, 660);
        
        setName("Admin Login");
      
       setTitle("Great Student Hostel");
       
        setForeground(Color.white);
     
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        setResizable(false);
       
           
      JPanel loginForm = new JPanel();
        
      loginForm.setLayout(null);
      
      loginForm.setBackground(new Color(0,199,0));
      
          
      JLabel title = new JLabel();
      
      title.setBounds(350, 0, 500, 50);
      title.setText("Admin Login");
      title.setFont(title.getFont().deriveFont(25f));
      title.setForeground(Color.white);
   
        
      add(loginForm);
      
     
    JLabel userNameLabel = new JLabel("User Name");
    userNameLabel.setBounds(210, 140, 200, 100);
    userNameLabel.setFont(userNameLabel.getFont().deriveFont(15f));
     
      
     
     JTextField userNameField = new JTextField();
     userNameField.setBounds(400, 180, 200, 30);
      
      
     JLabel passwordLabel = new JLabel();
     passwordLabel.setText("Password");
     passwordLabel.setFont(passwordLabel.getFont().deriveFont(15f));
     passwordLabel.setBounds(210, 230, 100, 100);
     
     JTextField passwordField= new JTextField();
     passwordField.setBounds(400, 265, 200, 30);
     
     JButton Login = new JButton("Login");
     
     Login.setBounds(400, 390, 100, 30);
     
     JButton back = new JButton("Back");
     back.setBounds(30, 570, 100, 30); 
     back.setFont(back.getFont().deriveFont(16f));
     
     JButton exit = new JButton("Exit");
     exit.setBounds(760, 570, 100, 30);
     exit.setFont(exit.getFont().deriveFont(16f));
     
      loginForm.add(userNameLabel);
      
      loginForm.add(userNameField);
      
      loginForm.add(passwordLabel);
      
      loginForm.add(passwordField);
      
      loginForm.add(Login);
      
      loginForm.add(title);
      
      loginForm.add(back);
      
      loginForm.add(exit);
      
      
       setVisible(true);
       
       Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try
            {
                userName = userNameField.getText();
                password = passwordField.getText();
                setVisible(false);
                 manageStudents obj = new  manageStudents();
                      obj.setVisible(true);
             
            }
            catch(NumberFormatException ee)
            {
            }
            }
        });
       
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setVisible(false);
                   mainScreen obj = new mainScreen();
                      obj.setVisible(true);
             
            }
        });
       
        
         exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             
            }
        });
       
        
      
       
       
       
       
     
      
      
    }
     public boolean validateUser(String name , String pass )
    {
      database.DataBase db = new DataBase();
     
      Connection con = db.getConnection();
      
      String sql = "Select name, password from users where user_type = A";
      

      
      return false;
    
    
    }
     

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
   
}
