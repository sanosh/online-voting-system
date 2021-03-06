/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovs;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

/**
 *
 * @author CHINTAN
 */
public class NewVoter extends javax.swing.JFrame {

    /**
     * Creates new form NewVoter
     */
    public String AadharNo,Username,Password,Email,MobileNo,tPassword=null;
    public char []arr = new char[25];
    
    public NewVoter() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
        mAadharNo.setUI(new HintTextFieldUI("Aadhar No.(12-Digits)", Color.GRAY));
        mEmail.setUI(new HintTextFieldUI("Email", Color.GRAY));
        mName.setUI(new HintTextFieldUI("Name", Color.GRAY));
        mPassword.setUI(new HintTextFieldUI("Password", Color.GRAY));
        mMobileNo.setUI(new HintTextFieldUI("Mobile No.(10-Digits)", Color.GRAY));
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mAadharNo = new javax.swing.JTextField();
        mEmail = new javax.swing.JTextField();
        mName = new javax.swing.JTextField();
        mPassword = new javax.swing.JTextField();
        mMobileNo = new javax.swing.JTextField();
        mRegister = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Voter Registration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 30, 1250, 90);

        mAadharNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        mAadharNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mAadharNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mAadharNoFocusLost(evt);
            }
        });
        getContentPane().add(mAadharNo);
        mAadharNo.setBounds(600, 230, 420, 60);

        mEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        mEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(mEmail);
        mEmail.setBounds(600, 320, 420, 60);

        mName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        mName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(mName);
        mName.setBounds(600, 410, 420, 60);

        mPassword.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        mPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasswordActionPerformed(evt);
            }
        });
        mPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(mPassword);
        mPassword.setBounds(600, 500, 420, 60);

        mMobileNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        mMobileNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mMobileNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mMobileNoFocusLost(evt);
            }
        });
        getContentPane().add(mMobileNo);
        mMobileNo.setBounds(600, 590, 420, 60);

        mRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ovs/8778789-designstyle-boots-m.png"))); // NOI18N
        mRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(mRegister);
        mRegister.setBounds(650, 690, 320, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHINTAN\\Downloads\\arrow_back_white_36x36.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 40, 70, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHINTAN\\Downloads\\Nice-Dark-Gradient.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-150, -140, 2070, 1070);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jLabel1.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        jLabel1.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        StartScreen s = new StartScreen();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    public boolean checkAadharno(String ad){
        if(ad.length() != 12)
               return false;
        for(int i = 0;i < ad.length();++i)
        {
            char c = ad.charAt(i);
            if(!(c >= '0' && c <= '9'))
                return false;
        }
        return true;
    }
    
    public boolean checkMobileno(String ad){
        if(ad.length() != 10)
               return false;
        for(int i = 0;i < ad.length();++i)
        {
            char c = ad.charAt(i);
            if(!(c >= '0' && c <= '9'))
                return false;
        }
        return true;
    }
    public void Reset(){
        mPassword.setText("");
        mName.setText("");
        mMobileNo.setText("");
        mEmail.setText("");
        mAadharNo.setText("");
    }
    
    private void mRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mRegisterMouseClicked
        // TODO add your handling code here:
        AadharNo = mAadharNo.getText();
        Email = mEmail.getText();
        MobileNo = mMobileNo.getText();
        Username = mName.getText();
        
        if(!AadharNo.isEmpty() && !Email.isEmpty() && !MobileNo.isEmpty() && !Username.isEmpty() && !Password.isEmpty() && checkAadharno(AadharNo) && checkMobileno(MobileNo)){
            
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
                
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("Select * from registered_users");
                boolean flag = false;
                while(rs.next()){if(AadharNo.equals(rs.getString("aadhar_no")))
                {  flag = true;
                break;}
                    }
                boolean ev = false;
                if(flag){
                    JOptionPane.showMessageDialog(new Frame("Invalid Entry"),"Record already exists !","Duplicate Record",JOptionPane.ERROR_MESSAGE);
                }else{
                 try {
                  ev = emailVerify();
                } catch (MessagingException ex) {
                    JOptionPane.showMessageDialog(new Frame("Invalid Email"),"Invalid Email Address","Email Verification",JOptionPane.ERROR_MESSAGE);
                }
                    
                if(ev){
                     PreparedStatement pp = conn.prepareStatement("INSERT INTO registered_users (username , aadhar_no,password,mobile_no,email,vote) VALUES (?,?,?,?,?,?)");
                pp.setString(1,Username);
                pp.setString(2, AadharNo);
                pp.setString(3, Password);
                pp.setString(4,MobileNo);
                pp.setString(5, Email);
                pp.setBoolean(6, false);
                pp.execute();
                pp.close();
                JOptionPane.showMessageDialog(new Frame("Account Created"),"Registration Successfull !","Registration",PLAIN_MESSAGE);
           
                   StartScreen ss = new StartScreen();
                   ss.setVisible(true);
                   this.dispose();
                }
                else{
                     JOptionPane.showMessageDialog(new Frame("Invalid Email"),"OTP doesn't match ! Try again.","Email Verification",JOptionPane.ERROR_MESSAGE);
                     Reset();
                }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(NewVoter.class.getName()).log(Level.SEVERE, null, ex);
            }  
    
           
        }
        else{
            JOptionPane.showMessageDialog(new Frame("Invalid Entry"),"Enter valid values in the fields.");
        }
        
    }//GEN-LAST:event_mRegisterMouseClicked

    private void mPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPasswordActionPerformed

    private void mPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mPasswordKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mPasswordKeyTyped

    boolean emailVerify() throws AddressException, MessagingException{
        String host = "smtp.gmail.com";
        String user = "santynit2015@gmail.com";
        String pass = "santynit";
        String to = Email;
        String from = "cj.djsaini@gmail.com";
        String subject = "Email Verification";
        
        Random rand = new Random();
        String id = String.format("%04d", rand.nextInt(10000));
        
        String message = "Your OTP for OVS account verification is "+id;
        boolean sessionDebug = false;
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.starttls.required","true");
        
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session mailSession = Session.getDefaultInstance(props,null);
        mailSession.setDebug(sessionDebug);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(from));
        InternetAddress address = (new InternetAddress(to));
        msg.setRecipient(Message.RecipientType.TO, address);
        msg.setSubject(subject);
        msg.setText(message);
        
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(host,user,pass);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
        String s = JOptionPane.showInputDialog(new Frame("Confirm Email"),"Enter OTP sent to " + to ,"Email Verification",JOptionPane.PLAIN_MESSAGE);
        if(s.equals(id))
            return true; 
        else
            return false;
    }
    
    
    private void mPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mPasswordKeyReleased
        // TODO add your handling code here:
        String temp = null ;
        char c = evt.getKeyChar();
       
        if(c == evt.VK_BACK_SPACE)
        {
           if(!tPassword.isEmpty())
                    tPassword = tPassword.substring(0, tPassword.length() - 1);
           //temp = temp.substring(0,temp.length()-1);
        }
        else{
                if(tPassword == null)
                    tPassword = ""+c;
                else
                    tPassword += c;
            //temp = temp.substring(0,temp.length()-1);
         //   temp += '*';          
        }
        if(tPassword.isEmpty())
            mPassword.setText("");
        else{
            temp = ""+'*';
            int l = tPassword.length();
            while(l-- > 1)
                temp += '*';
            mPassword.setText(temp);
        }
        Password = tPassword;
    }//GEN-LAST:event_mPasswordKeyReleased

    private void mAadharNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mAadharNoFocusLost
        // TODO add your handling code here:
        String temp = mAadharNo.getText();
        boolean flag = true;
        if(!temp.isEmpty()){
            if(temp.length() != 12)
               flag = false;
        for(int i = 0;i < temp.length();++i)
        {
            char c = temp.charAt(i);
            if(!(c >= '0' && c <= '9'))
                flag =  false;
        }
        if(!flag){
            JOptionPane.showMessageDialog(new Frame("Invalid Aadhar Number"),"Enter a valid 12 digits Aadhar Number.","Invalid Aadhar Number",JOptionPane.ERROR_MESSAGE);
            mAadharNo.setText("");
        }}
    }//GEN-LAST:event_mAadharNoFocusLost

    private void mMobileNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mMobileNoFocusLost
        // TODO add your handling code here:
        String temp = mMobileNo.getText();
        boolean flag = true;
        if(!temp.isEmpty()){
            if(temp.length() != 10)
               flag = false;
        for(int i = 0;i < temp.length();++i)
        {
            char c = temp.charAt(i);
            if(!(c >= '0' && c <= '9'))
                flag =  false;
        }
        if(!flag){
            JOptionPane.showMessageDialog(new Frame("Invalid Mobile Number"),"Enter a valid 10 digits Moible Number.","Invalid Mobile Number",JOptionPane.ERROR_MESSAGE);
            mMobileNo.setText("");
        }}
    }//GEN-LAST:event_mMobileNoFocusLost

    private void mPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mPasswordKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(c == KeyEvent.VK_BACK_SPACE){
           tPassword ="";
           Password ="";
           mPassword.setText("");
       }
    }//GEN-LAST:event_mPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(NewVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewVoter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mAadharNo;
    private javax.swing.JTextField mEmail;
    private javax.swing.JTextField mMobileNo;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField mPassword;
    private javax.swing.JLabel mRegister;
    // End of variables declaration//GEN-END:variables
}
