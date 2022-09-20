
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dell
 */
public class CPage extends javax.swing.JFrame {
    public static String username = Login.jTextField1.getText();
    public String id="1";
    public int min=0;
    public int sec=0;
    public String answer;
    public int C=0;
    Timer time;
    
    public void answerCheck(){
    String studentAnswer="";
    if(jRadioButton1.isSelected())
    {
       studentAnswer=jRadioButton1.getText(); 
    }
    else if(jRadioButton2.isSelected())
    {
       studentAnswer=jRadioButton2.getText(); 
    }
    else if(jRadioButton3.isSelected())
    {
       studentAnswer=jRadioButton3.getText(); 
    }
    else if(jRadioButton4.isSelected())
    {
       studentAnswer=jRadioButton4.getText(); 
   
    }
    else {
        C = C +0;
    
    }
    if(studentAnswer.equals(answer))
    {
        C=C+1;
        String marks1=String.valueOf(C);
        jLabel12.setText(marks1);
    }
    int Ques=Integer.parseInt(id);
    Ques=Ques+1;
    id=String.valueOf(Ques);
    
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
        
    
    if (id.equals("10"))
    {
        jButton1.setVisible(false);
    }
    }
    
    public void Question(){
    try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Kanthed@45");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from cquestion where id='"+id+"'");
            while (rs.next()){
            jLabel9.setText(rs.getString(1));
            jLabel10.setText(rs.getString(3));
            jRadioButton1.setText(rs.getString(4));
            jRadioButton2.setText(rs.getString(5));
            jRadioButton3.setText(rs.getString(6));
            jRadioButton4.setText(rs.getString(7));
            answer=rs.getString(8);
            }
        }
        catch (SQLException e)
        {
                }
    }
    public void submit(){
        answerCheck();
        String Username=jLabel14.getText();
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Kanthed@45");
            Statement st = con.createStatement();
            st.executeQuery("update result set marks='"+C+"' where username='"+Username+"'");
            String marks1=String.valueOf(C);
//            String nme = jTextField1.getText();
            setVisible(false);
//            new MarksObtained(nme).setVisible(true);
//            PreparedStatement ps;
//            ResultSet rs;
//            String marksQuery = "INSERT INTO `result`(`userame`,`C`) VALUES (?,?)";
           // ps = db.mycon().prepareStatement(marksQuery);
//            ps.setString(4,marks1);
//            ps.setString(1,nme);
        }
        catch (SQLException e)
        {
                }
    }

    /**
     * Creates new form CPage
     */
    public CPage() {
        initComponents();
    }
    public CPage(String Username) {
        initComponents();
        jLabel14.setText(username);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Kanthed@45");
            Statement st = con.createStatement();
            //ResultSet rs = st.executeQuery("Select * from std_register where Username'"+Username+"'");
            ResultSet rs1 = st.executeQuery("Select * from cquestion where id'"+id+"'");
            while (rs1.next()){
            jLabel9.setText(rs1.getString(1));
            jLabel10.setText(rs1.getString(3));
            jRadioButton1.setText(rs1.getString(4));
            jRadioButton2.setText(rs1.getString(5));
            jRadioButton3.setText(rs1.getString(6));
            jRadioButton4.setText(rs1.getString(7));
            answer=rs1.getString(8);
            }
        }
        catch (SQLException e)
        {
                }
        
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Kanthed@45");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from std_register where Username'"+Username+"'");
//            while (rs.next()){
//                jLabel14.setText(rs.getString(4));
//            }

            ResultSet rs1 = st.executeQuery("Select * from cquestion where id'"+id+"'");
            while (rs1.next()){
            jLabel9.setText(rs1.getString(1));
            jLabel10.setText(rs1.getString(3));
            jRadioButton1.setText(rs1.getString(4));
            jRadioButton2.setText(rs1.getString(5));
            jRadioButton3.setText(rs1.getString(6));
            jRadioButton4.setText(rs1.getString(7));
            answer=rs1.getString(8);
            }
        }
        catch (SQLException e)
        {
                }
        setLocationRelativeTo(this);
        time=new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              jLabel5.setText(String.valueOf(sec));
              jLabel4.setText(String.valueOf(min));
                
                if(sec==60)
                {
                  sec=0;
                  min++;
                if (min==10)
                {
                  time.stop();
                  answerCheck();
                  submit();
                }
                
                }
                sec++;
                
            }
        }); 
        time.start();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 120));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Total Time : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Timer : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("10 Mins");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 25, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("00");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 58, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("00");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 58, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setText("Total Question : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setText("Question No.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setText("10");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setText("00");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel10.setText("Question Demo ?");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 135, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 174, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 213, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 252, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 291, -1, -1));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel11.setText("Marks");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel12.setText("00");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel13.setText("Username :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 757, 450));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\Online_Examination_system\\src\\main\\java\\Images\\jk.jpg")); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

        if(jRadioButton1.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        answerCheck();
        Question();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        

        int a=JOptionPane.showConfirmDialog(null,"Do you really want to submit?","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            answerCheck();
            submit();
        }
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Kanthed@45");
            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement("Insert into result (username, C) VALUE(?,?);");
            String c = Integer.toString(C);
            pst.setString(1, username);
            pst.setString(2, c);
            pst.executeUpdate();
            
            PreparedStatement ps = con.prepareStatement("insert into "+username+" (C) value(?);");
            ps.setString(1, c);
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
                }
            setVisible(false);
            new MarksObtained(C).setVisible(true);

        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
