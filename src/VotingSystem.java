
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




public class VotingSystem {
      static PreparedStatement pstmt;
      static  ResultSet rs;
      static  Connection conn;
           
    
    public static void main(String[] args) {
       
  Loading id = new Loading();
     id.setVisible(true);
      try{
            for(int i=0;i<=100;i++){
                Thread.sleep(80);
                id.jLabel1.setText(Integer.toString(i)+"%");
                id.jProgressBar1.setValue(i);
                
                if(i==100){
                     //onee();
                  id.setVisible(false);  
                // switchd();
                  Home1 lg = new Home1();
                    lg.setVisible(true);
                   
                }
            }
        }catch(Exception e){ 
      }
    
    }
     private static void onee(){
    String sql = "CREATE TABLE IF NOT EXISTS `DATA`  (NAME VARCHAR(100) , FINGER LONGBLOB,  IMAGE LONGBLOB, GENDER VARCHAR(10), DEPARTMENT VARCHAR(100))";
    try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finger","root","");
//             pstmt = conn.prepareStatement(sql);
        
        pstmt.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null , e);
    }
}
    
    public static void switchd(){
        conn = Javaconnect.ConnecrDB();
      int count =0;
        String sql = "Select Name from data";
        try{
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
              while(rs.next()){
                count = count + 1;
            }
              if(count > 0){
                  Login m = new Login();
                  m.setVisible(true);
              }else{
                    
                     Home1 lg = new Home1();
                    lg.setVisible(true);
              }
              
        }catch(Exception e){
            
        }
    }
    
}
