/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Account;
import controller.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Gekyumeu
 */
public class Register extends javax.swing.JFrame {

    User usr = new User();
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
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
        tf_reg_fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_reg_lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_reg_uname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pf_reg_pword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btn_reg_register = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rb_reg_male = new javax.swing.JRadioButton();
        rb_reg_female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(6, 44, 368, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(68, 94, 88, 25);
        jPanel2.add(tf_reg_fname);
        tf_reg_fname.setBounds(68, 131, 259, 41);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(68, 184, 86, 25);
        jPanel2.add(tf_reg_lname);
        tf_reg_lname.setBounds(68, 221, 259, 41);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(68, 268, 85, 25);
        jPanel2.add(tf_reg_uname);
        tf_reg_uname.setBounds(68, 305, 259, 41);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(68, 358, 80, 25);

        pf_reg_pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_reg_pwordActionPerformed(evt);
            }
        });
        jPanel2.add(pf_reg_pword);
        pf_reg_pword.setBounds(68, 389, 259, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(68, 435, 62, 25);

        btn_reg_register.setBackground(new java.awt.Color(204, 102, 0));
        btn_reg_register.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reg_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_reg_register.setText("Register");
        btn_reg_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reg_registerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reg_register);
        btn_reg_register.setBounds(68, 526, 94, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Already have an account?  Log in here");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(68, 570, 233, 20);

        rb_reg_male.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rb_reg_male.setForeground(new java.awt.Color(255, 255, 255));
        rb_reg_male.setText("Male");
        rb_reg_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_reg_maleActionPerformed(evt);
            }
        });
        jPanel2.add(rb_reg_male);
        rb_reg_male.setBounds(68, 474, 61, 30);

        rb_reg_female.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rb_reg_female.setForeground(new java.awt.Color(255, 255, 255));
        rb_reg_female.setText("Female");
        jPanel2.add(rb_reg_female);
        rb_reg_female.setBounds(166, 474, 79, 30);

        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 440, 640);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(437, -4, 420, 640);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/restaurant.tagalog.gif"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-30, 130, 490, 370);

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 150, 630);

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 0, 150, 630);

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(200, 0, 160, 630);

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, -60, 440, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reg_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg_registerActionPerformed
        // TODO add your handling code here:
        Account  acc = new Account();
        
        String firstname = tf_reg_fname.getText().trim();
        String lastname = tf_reg_lname.getText().trim();
        String username = tf_reg_uname.getText().trim();
        String password = new String(pf_reg_pword.getPassword());
        String gender_male = rb_reg_male.getText().trim();
        String gender_female = rb_reg_male.getText().trim();
        
        if(username.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
        }
        else {
            acc.setFirst_name(tf_reg_fname.getText());
            acc.setLast_name(tf_reg_lname.getText());
            acc.setUsername(tf_reg_uname.getText());
            acc.setPassword(new String(pf_reg_pword.getPassword()));
            acc.setStatus(2); //customer status code is 2
            if(rb_reg_male.isSelected())
            {
                acc.setGender("Male");
            }
            if(rb_reg_female.isSelected())
            {
                acc.setGender("Female");
            }

            usr.register(acc);
            Login log = new Login();
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_reg_registerActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void rb_reg_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_reg_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_reg_maleActionPerformed

    private void pf_reg_pwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_reg_pwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_reg_pwordActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reg_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPasswordField pf_reg_pword;
    private javax.swing.JRadioButton rb_reg_female;
    private javax.swing.JRadioButton rb_reg_male;
    private javax.swing.JTextField tf_reg_fname;
    private javax.swing.JTextField tf_reg_lname;
    private javax.swing.JTextField tf_reg_uname;
    // End of variables declaration//GEN-END:variables
}
