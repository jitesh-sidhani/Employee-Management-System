package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JTextField tfusername,tfpassword;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);
        
        tfusername=new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);
        
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(40,70,100,30);
        add(lblpassword);
        
        tfpassword=new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);
                
        JButton login=new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        add(login);
        login.setBackground(Color.BLACK);
        login.addActionListener(this);
        login.setForeground(Color.WHITE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(350,0,200,200);

        setSize(600,300);
        setVisible(true);
        setLocation(450,200);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String username = tfusername.getText();
            String password=tfpassword.getText();
            
            String query="select * from login where username = '"+username+"' and password = '"+password+"'";
            Conn c=new Conn();
            
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
                setVisible(false);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Login();
    }
}