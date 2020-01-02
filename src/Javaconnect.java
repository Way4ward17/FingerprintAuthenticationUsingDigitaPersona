


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Javaconnect {
    public static Connection ConnecrDB(){
        try{
       ////   Class.forName("org.h2.Driver");
       //     Connection conn = DriverManager.getConnection("jdbc:h2:~/finger","sa","");
            
            
               Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finger","root","");
//           
            
            return conn;
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
}
}
