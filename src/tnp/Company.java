/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tnp;

/**
 *
 * @author skbag
 */
import javax.swing.*;
import java.sql.*;
public class Company extends JFrame {
    int flag;
    Connection cn=null;
    Statement st=null,st1=null;
    /**
     * Creates new form Company
     */
    public Company() {
        initComponents();
        flag=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","");
            st=cn.createStatement();
            st1=cn.createStatement();
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Company Name");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Package");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("No. of Back");

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Aggregate(%)");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Select Branch");

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox1.setText("CSE");

        jCheckBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox2.setText("IT");

        jCheckBox3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox3.setText("ECE");

        jCheckBox4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox4.setText("EEE");

        jCheckBox5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox5.setText("CE");

        jCheckBox6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox6.setText("AI");

        jCheckBox7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox7.setText("ME");

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cmp=jTextField1.getText().trim();
        try{
            if(flag==0){
                String pkg=jTextField2.getText().trim();
                int back=Integer.parseInt(jTextField3.getText().trim());
                int aggr=Integer.parseInt(jTextField4.getText().trim());
                String branch1="",branch2="",branch3="",branch4="",branch5="",branch6="",branch7="";
                if(jCheckBox1.isSelected()){
                   branch1="CSE";
                }
                if(jCheckBox2.isSelected()){
                   branch2="IT";
                }
                if(jCheckBox3.isSelected()){
                   branch3="ECE";
                }
                if(jCheckBox4.isSelected()){
                   branch4="EEE";
                }
                if(jCheckBox5.isSelected()){
                   branch5="CE";
                }
                if(jCheckBox6.isSelected()){
                   branch6="AI";
                }
                if(jCheckBox7.isSelected()){
                   branch7="ME";
                }
                PreparedStatement ps=cn.prepareStatement("insert into company values(?,?,?,?)");
                ps.setString(1,cmp);
                ps.setString(2,pkg);
                ps.setInt(3, back);
                ps.setInt(4,aggr);
                PreparedStatement ps1=cn.prepareStatement("insert into branches values(?,?,?,?,?,?,?,?)");
                ps1.setString(1,cmp);
                ps1.setString(2, branch1);
                ps1.setString(3, branch2);
                ps1.setString(4, branch3);
                ps1.setString(5, branch4);
                ps1.setString(6, branch5);
                ps1.setString(7, branch6);
                ps1.setString(8, branch7);
                if((ps.executeUpdate() & ps1.executeUpdate())>0){
                    JOptionPane.showMessageDialog(null, "Record Inserted");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Try Again");
                }
            }
            else if(flag==1){
                String pkg=jTextField2.getText().trim();
                int back=Integer.parseInt(jTextField3.getText().trim());
                int aggr=Integer.parseInt(jTextField4.getText().trim());
                String branch1="",branch2="",branch3="",branch4="",branch5="",branch6="",branch7="";
                if(jCheckBox1.isSelected()){
                   branch1="CSE";
                }
                if(jCheckBox2.isSelected()){
                   branch2="IT";
                }
                if(jCheckBox3.isSelected()){
                   branch3="ECE";
                }
                if(jCheckBox4.isSelected()){
                   branch4="EEE";
                }
                if(jCheckBox5.isSelected()){
                   branch5="CE";
                }
                if(jCheckBox6.isSelected()){
                   branch6="AI";
                }
                if(jCheckBox7.isSelected()){
                   branch7="ME";
                }
                PreparedStatement ps=cn.prepareStatement("update company set pkg=?,backlogs=?,aggr=? where cmp_name=?");
                ps.setString(1,pkg);
                ps.setInt(2, back);
                ps.setInt(3,aggr);
                ps.setString(4,cmp);
                PreparedStatement ps1=cn.prepareStatement("update branches set branch1=?,branch2=?,branch3=?,branch4=?,branch5=?,branch6=?,branch7=? where cmp_name=?");
                ps1.setString(1,branch1);
                ps1.setString(2,branch2);
                ps1.setString(3,branch3);
                ps1.setString(4,branch4);
                ps1.setString(5,branch5);
                ps1.setString(6,branch6);
                ps1.setString(7,branch7);
                ps1.setString(8, cmp);
                if((ps.executeUpdate() & ps1.executeUpdate())>0){
                    JOptionPane.showMessageDialog(null, "Record Updated");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Try Again");
                }
            }
            else{
                PreparedStatement ps=cn.prepareStatement("delete from company where cmp_name=?");
                ps.setString(1,cmp);
                PreparedStatement ps1=cn.prepareStatement("delete from branches where cmp_name=?");
                ps1.setString(1, cmp);
                if((ps.executeUpdate() & ps1.executeUpdate())>0){
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Try Again");
                }
            }
            cn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.setVisible(false);
        new Company().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        flag=1;
        String cmp=jTextField1.getText();
        if(cmp.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Company");
        }
        else{
            try{
                ResultSet rs=st.executeQuery("select * from company where cmp_name='"+cmp+"'");
                ResultSet rs1=st1.executeQuery("select * from branches where cmp_name='"+cmp+"'");
                if(rs.next() & rs1.next()){
                    jTextField1.setText(rs.getString("cmp_name"));
                    jTextField2.setText(rs.getString("pkg"));
                    jTextField3.setText(rs.getInt(3)+"");
                    jTextField4.setText(rs.getInt(4)+"");
                    String branch1=rs1.getString("branch1");
                    String branch2=rs1.getString("branch2");
                    String branch3=rs1.getString("branch3");
                    String branch4=rs1.getString("branch4");
                    String branch5=rs1.getString("branch5");
                    String branch6=rs1.getString("branch6");
                    String branch7=rs1.getString("branch7");
                    if(branch1.equals("CSE")){
                        jCheckBox1.setSelected(true);
                    }
                    if(branch2.equals("IT")){
                        jCheckBox2.setSelected(true);
                    }
                    if(branch3.equals("ECE")){
                        jCheckBox3.setSelected(true);
                    }
                    if(branch4.equals("EEE")){
                        jCheckBox4.setSelected(true);
                    }
                    if(branch5.equals("CE")){
                        jCheckBox5.setSelected(true);
                    }
                    if(branch6.equals("AI")){
                        jCheckBox6.setSelected(true);
                    }
                    if(branch7.equals("ME")){
                        jCheckBox7.setSelected(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Record Not Found");
                    this.setVisible(false);
                    new Company().setVisible(true);
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        flag=2;
        String cmp=jTextField1.getText();
        if(cmp.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Company");
        }
        else{
            try{
                ResultSet rs=st.executeQuery("select * from company where cmp_name='"+cmp+"'");
                ResultSet rs1=st1.executeQuery("select * from branches where cmp_name='"+cmp+"'");
                if(rs.next() & rs1.next()){
                    jTextField1.setText(rs.getString("cmp_name"));
                    jTextField2.setText(rs.getString("pkg"));
                    jTextField3.setText(rs.getInt(3)+"");
                    jTextField4.setText(rs.getInt(4)+"");
                    String branch1=rs1.getString("branch1");
                    String branch2=rs1.getString("branch2");
                    String branch3=rs1.getString("branch3");
                    String branch4=rs1.getString("branch4");
                    String branch5=rs1.getString("branch5");
                    String branch6=rs1.getString("branch6");
                    String branch7=rs1.getString("branch7");
                    if(branch1.equals("CSE")){
                        jCheckBox1.setSelected(true);
                    }
                    if(branch2.equals("IT")){
                        jCheckBox2.setSelected(true);
                    }
                    if(branch3.equals("ECE")){
                        jCheckBox3.setSelected(true);
                    }
                    if(branch4.equals("EEE")){
                        jCheckBox4.setSelected(true);
                    }
                    if(branch5.equals("CE")){
                        jCheckBox5.setSelected(true);
                    }
                    if(branch6.equals("AI")){
                        jCheckBox6.setSelected(true);
                    }
                    if(branch7.equals("ME")){
                        jCheckBox7.setSelected(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Record Not Found");
                    new Company().setVisible(true);
                    this.setVisible(false);
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Management().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Company().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
