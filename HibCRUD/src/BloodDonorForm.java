import hib.dto.BloodDonorReg;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jdatepicker.DateModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manis
 */
public class BloodDonorForm extends javax.swing.JFrame {

    /**
     * Creates new form BloodDonorForm
     */
    public BloodDonorForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city", "indore", "bhopal", "ujjain" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 0));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 290, -1));

        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 252));
        jLabel5.setText("Age");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 30, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 252));
        jLabel7.setText("ContactNo");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, -1));

        jLabel8.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 252));
        jLabel8.setText("Name");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 40, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton2.setText("Reset");
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 290, -1));

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 290, -1));

        jLabel10.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 252));
        jLabel10.setText("Gender");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 50, -1));

        jRadioButton1.setText("FEMALE");
        jPanel6.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jRadioButton2.setText("MALE");
        jPanel6.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 252));
        jLabel11.setText("Email");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 213, 50, -1));

        jLabel12.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 252));
        jLabel12.setText("Address");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 290, -1));

        jLabel13.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 252));
        jLabel13.setText("City");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 40, -1));

        jLabel14.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 252));
        jLabel14.setText("Blood group");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select blood group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 220, -1));

        jTextField4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 290, -1));

        jLabel17.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 243));
        jLabel17.setText("UserId");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 20));
        jPanel6.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 280, -1));

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 290, -1));

        jLabel16.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 252));
        jLabel16.setText("Did you ever donate blood before?");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 210, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 290, 60));

        jLabel18.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 252));
        jLabel18.setText("Occupation");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 80, -1));

        jTextField6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 290, -1));

        jLabel19.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 252));
        jLabel19.setText("MedicalHistory");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 100, -1));

        jCheckBox3.setText("YES");
        jPanel6.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jCheckBox4.setText("NO");
        jPanel6.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jLabel20.setFont(new java.awt.Font("Bernard MT Condensed", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 252));
        jLabel20.setText("DonorSignature");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 90, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city", "indore", "bhopal", "ujjain" }));
        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 280, -1));

        jScrollPane1.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int userId=Integer.parseInt(jTextField1.getText());
        String name=jTextField3.getText();
        long contact=Long.parseLong(jTextField2.getText());
        String age=(String)jSpinner1.getValue();
        String gender="";
        if(jRadioButton1.isSelected())
            gender="FEMALE";
        if(jRadioButton2.isSelected())
            gender="MALE";
        String email=jTextField6.getText();       
        String address=jTextArea2.getText();       
        String city=(String)jComboBox4.getSelectedItem();
        String bloodGroup=(String)jComboBox2.getSelectedItem();
        String occupation=jTextField4.getText();
        String bloodDonationHistory="";
        if(jCheckBox3.isSelected())
            bloodDonationHistory="MARRIED";
        if(jCheckBox4.isSelected())
            bloodDonationHistory="UNMARRIED";
        String medicalHistory=jTextArea1.getText();
        String donorSignature=jTextField5.getText();       
        
        
        Configuration c1=new Configuration();
            Configuration c2=c1.configure();
            SessionFactory sf=c2.buildSessionFactory();
            Session session=sf.openSession();
            Transaction tx=session.beginTransaction();
            
             BloodDonorReg bl=new BloodDonorReg(userId,name,contact,age,gender,email,address,city,bloodGroup,occupation,medicalHistory,donorSignature);
             session.save(bl);
              tx.commit();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BloodDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodDonorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}