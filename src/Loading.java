/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author WAY4WARD
 */
public class Loading extends javax.swing.JFrame {
Connection conn;
PreparedStatement pstmt;
ResultSet rs;
    /**
     * Creates new form Loading
     */
    public Loading() {
      //onee();
      //  one();
      //  two();
      //  three();
      //  four();
      //  five();
        initComponents();
    }
 private void onee(){
    String sql = "CREATE TABLE IF NOT EXISTS `DATA`  (NAME VARCHAR(100) , FINGER LONGBLOB,  IMAGE LONGBLOB, GENDER VARCHAR(10), DEPARTMENT VARCHAR(100))";
    try{
        Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        
        pstmt = conn.prepareStatement(sql);
        
        pstmt.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null , e);
    }
}
    private void one(){
    String sql = "CREATE TABLE IF NOT EXISTS `admin` (`Username` varchar(30) NOT NULL,`Password` varchar(30) NOT NULL, `Name` varchar(30) NOT NULL,`ID`"
         + " varchar(30) NOT NULL,`Gender` varchar(30)"
         + " NOT NULL,`Date` varchar(30) NOT NULL)";
    try{
        Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        
        pstmt = conn.prepareStatement(sql);
        pstmt.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null , e);
    }
}

private void two(){
   String sqll = "CREATE TABLE IF NOT EXISTS `position` (`Name` varchar(30) NOT NULL)"; 
    try{
        Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        
        pstmt = conn.prepareStatement(sqll);
        pstmt.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null , e);
    }
}
private void three(){
    String sqlll = "CREATE TABLE IF NOT EXISTS `voted`  (`Name` varchar(30) NOT NULL"
        + ",`Position` varchar(30) NOT NULL,`Gender` varchar(30) NOT NULL,`ID` varchar(30) NOT NULL)";
try{Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        
        pstmt = conn.prepareStatement(sqlll);
        pstmt.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null , e);
    }
}

private void four(){
    String sqlm = "CREATE TABLE IF NOT EXISTS `voters`  (`Name` varchar(30) NOT NULL,`Position` varchar(30) NOT NULL,`Gender` varchar(30) NOT NULL,`ID` varchar(30) NOT NULL)";
    try{
        Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        
        pstmt = conn.prepareStatement(sqlm);
        pstmt.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null , e);
    }
}
private void five(){
     String sqln ="CREATE TABLE IF NOT EXISTS `votingmember`  (`Name` varchar(30) NOT NULL,`Position` varchar(30) NOT NULL, `Phone` varchar(30) NOT NULL,`Gender` varchar(30) NOT NULL, `Image` longblob NOT NULL)";
        
        try{
           Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        
  pstmt = conn.prepareStatement(sqln);
        pstmt.execute();

       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
         //  return null;
       }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0%");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 300, 30, 15);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 320, 690, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/biometric-privacy-laws_EmployerLINC-1024x500.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 730, 350);

        setSize(new java.awt.Dimension(688, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
