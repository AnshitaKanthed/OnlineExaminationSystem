/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import co.yogesh.Captcha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author dell
 */
public class Register1 extends javax.swing.JFrame {

    /**
     * Creates new form Register1
     */
    Captcha cap = new Captcha();
    public Register1() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        cap.setImageCaptcha(captcha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        captcha = new javax.swing.JLabel();
        Verify = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 120));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51,150));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student's Registration");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 28, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student's Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 79, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 113, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email Id");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 147, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 187, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 221, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 256, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 74, 149, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 108, 149, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 142, 149, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 182, 149, -1));
        jPanel2.add(captcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 305, -1, -1));
        jPanel2.add(Verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 118, 30));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\Online_Examination_system\\src\\main\\java\\Images\\back 1.jpg")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\Online_Examination_system\\src\\main\\java\\Images\\login 1.jpg")); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("verify");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, -1));

        jPasswordField2.setText("jPasswordField2");
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 470, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\Online_Examination_system\\src\\main\\java\\Images\\jklu 3.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
//        new StudentHome().setVisible(true);
        
        String Name = jTextField1.getText();
        String Contact_Number = jTextField2.getText();
        String Email = jTextField3.getText();
        String Username = jTextField4 .getText();
        String Password = String.valueOf(jPasswordField1.getPassword());
        String password1 = String.valueOf(jPasswordField2.getPassword());


        if(verifyFields()){


            if(!checkUsername(Username)){

                PreparedStatement ps, ps2;

                ResultSet rs;

                String registerUserQuery = "INSERT INTO `std_register`(`Name`, `Contact_Number`, `Email`, `Username`, `Password`, `password1`) VALUES (?,?,?,?,?,?)";
                String loginUserQuery = "INSERT INTO `std_info`(`Username`, `Password`) VALUES (?,?)";

                try {
                    ps2 = db.mycon().prepareStatement(loginUserQuery);
                    ps2.setString(2, password1);
                    ps2.setString(1, Username);

                    ps = db.mycon().prepareStatement(registerUserQuery);
                    ps.setString(1, Name);
                    ps.setString(2, Contact_Number);
                    ps.setString(3, Email);
                    ps.setString(4, Username);
                    ps.setString(5, Password);
                    ps.setString(6, password1);
                    
                    

                    if(ps.executeUpdate() != 0){

                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                        
                        db con = new db();
                        con.createUserSpecficTable(Username);
                        
                        setVisible(false);
                        new Login().setVisible(true);
                        //new Instruction(Username).setVisible(true);

                    }else{

                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                    if(ps2.executeUpdate() != 0){

                    }else{

                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }

                } catch(Exception e)

                    {System.out.println(e);}

            }
            
            
            
        }
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        if(cap.Validate (captcha,Verify.getText()))

JOptionPane.showMessageDialog(this, "Captcha matched");

else

JOptionPane.showMessageDialog(this, "Captcha does not match");


    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Verify;
    private javax.swing.JLabel captcha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
public boolean checkUsername(String username){

        PreparedStatement st;

        ResultSet rs;

        boolean username_exist = false;

        String query = "SELECT * FROM `std_register` WHERE `username` = ?";

        try {

            st = db.mycon().prepareStatement(query);

            st.setString(1, username);

            rs = st.executeQuery();

            if(rs.next()){

                username_exist = true;

                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);

            }

        } catch(Exception e)

            {System.out.println(e);}

        return username_exist;

    }

    public boolean verifyFields() {

        String Name = jTextField1.getText();
        String Contact_Number = jTextField2.getText();
        String Email = jTextField3.getText();
        String Username = jTextField4.getText();
        String Password = String.valueOf(jPasswordField1.getPassword());
        String password1 = String.valueOf(jPasswordField2.getPassword());

        if(Name.trim().equals("") || Email.trim().equals("") ||Username.trim().equals("") || Contact_Number.trim().equals("")|| Password.trim().equals("") || password1.trim().equals("")) {

            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);

            return false;

        }

        else if(!Password.equals(password1)) {

            JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2);

            return false;

        }

        else{

            return true;

        }
    }}