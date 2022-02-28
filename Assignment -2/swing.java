import javax.swing.*;
import java.sql.*;

public class swing {
   
    static JLabel Text1, Text2,Text3;
    static JTextField Name,age,address;
    static void Outline(String name, String addr, int age1){
      JFrame frame = new JFrame();
        Text1 = new JLabel("Student Name :");
        Text1.setBounds(20,100,200,30);
        Name = new JTextField(name);
        Name.setBounds(110,100, 200,30);  
        Text2 = new JLabel("Age :");
        Text2.setBounds(80,150,200,30);
        age = new JTextField(Integer.toString(age1));
        age.setBounds(110,150, 200,30);  
        Text3 = new JLabel("Address :");
        Text3.setBounds(50,200,200,30);
        address = new JTextField(addr);
        address.setBounds(110,200,200,30);
        frame.add(Text1);
        frame.add(Text2);
        frame.add(Text3);
        frame.add(Name);
        frame.add(age);
        frame.add(address);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
      }

      public static void main(String args[]) throws SQLException{
        

        try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentlist?characterEncoding=latin1", "root", "root");
          Statement stm = con.createStatement();
          ResultSet re = stm.executeQuery("select * from details");
          while(re.next())
          { 
            Outline(re.getString(1), re.getString(3), re.getInt(2));
          }
          con.close();
        } catch (ClassNotFoundException e) {
          System.out.println("SQL Driver Not Found");
          
        }
        
        
      }

     
    }
