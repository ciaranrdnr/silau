/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.sql.Date;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ciara
 */
public class dialogcreate extends javax.swing.JFrame {

    private static dialogcreate obj = null;

    /**
     * Creates new form dialogcreate
     */
    public dialogcreate() {
        initComponents();
    }

    public static dialogcreate getObj() {
        if (obj == null) {
            obj = new dialogcreate();
        }
        return obj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pSignupC = new javax.swing.JPanel();
        tfEmail = new javax.swing.JTextField();
        bSignup = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbKebijakan = new javax.swing.JCheckBox();
        lSignIn = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfBirthday = new javax.swing.JFormattedTextField();
        tfNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfNIK = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(610, 822));
        setResizable(false);

        pSignupC.setBackground(new java.awt.Color(255, 255, 255));
        pSignupC.setLayout(null);

        tfEmail.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        pSignupC.add(tfEmail);
        tfEmail.setBounds(80, 450, 440, 60);

        bSignup.setBackground(new java.awt.Color(254, 182, 63));
        bSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSignupMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel11.setText("Sign Up");

        javax.swing.GroupLayout bSignupLayout = new javax.swing.GroupLayout(bSignup);
        bSignup.setLayout(bSignupLayout);
        bSignupLayout.setHorizontalGroup(
            bSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bSignupLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel11)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        bSignupLayout.setVerticalGroup(
            bSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bSignupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        pSignupC.add(bSignup);
        bSignup.setBounds(80, 680, 440, 60);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel9.setText("Email Address");
        pSignupC.add(jLabel9);
        jLabel9.setBounds(80, 420, 180, 29);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setText("Create Password");
        pSignupC.add(jLabel10);
        jLabel10.setBounds(80, 520, 200, 29);

        cbKebijakan.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cbKebijakan.setText("Saya setuju dengan Kebijakan SILAU.");
        pSignupC.add(cbKebijakan);
        cbKebijakan.setBounds(80, 630, 330, 31);

        lSignIn.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSignIn.setText("Sudah punya akun? klik disini");
        lSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lSignInMouseClicked(evt);
            }
        });
        pSignupC.add(lSignIn);
        lSignIn.setBounds(80, 750, 440, 24);

        tfPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });
        pSignupC.add(tfPass);
        tfPass.setBounds(80, 550, 440, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Username");
        pSignupC.add(jLabel12);
        jLabel12.setBounds(80, 320, 140, 29);

        tfUsername.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });
        pSignupC.add(tfUsername);
        tfUsername.setBounds(80, 350, 440, 60);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Full Name");
        pSignupC.add(jLabel13);
        jLabel13.setBounds(80, 140, 180, 29);

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setText("Birthday (dd/mm/yyyy)");
        pSignupC.add(jLabel15);
        jLabel15.setBounds(80, 230, 260, 29);

        tfBirthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        tfBirthday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBirthdayMouseClicked(evt);
            }
        });
        tfBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBirthdayActionPerformed(evt);
            }
        });
        pSignupC.add(tfBirthday);
        tfBirthday.setBounds(80, 260, 440, 60);

        tfNama.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });
        pSignupC.add(tfNama);
        tfNama.setBounds(80, 170, 440, 60);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("NIK");
        pSignupC.add(jLabel1);
        jLabel1.setBounds(80, 50, 51, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tfNIK.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfNIK.setBorder(null);
        tfNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tfNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pSignupC.add(jPanel1);
        jPanel1.setBounds(80, 80, 440, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pSignupC, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pSignupC, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", tfEmail.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The email is valid", "Good!", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_tfEmailActionPerformed

    private void bSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignupMouseClicked


    }//GEN-LAST:event_bSignupMouseClicked

    private void bSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignupMouseEntered
        bSignup.setBackground(new Color(255, 197, 91));
    }//GEN-LAST:event_bSignupMouseEntered

    private void bSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignupMouseExited
        bSignup.setBackground(new Color(254, 182, 53));
    }//GEN-LAST:event_bSignupMouseExited

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tfBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBirthdayActionPerformed

    }//GEN-LAST:event_tfBirthdayActionPerformed

    private void lSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSignInMouseClicked
        dialogcreate.getObj().dispose();
        dialogLogin.getObj().setVisible(true);
    }//GEN-LAST:event_lSignInMouseClicked

    private void tfBirthdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBirthdayMouseClicked
        tfBirthday.setFont(new java.awt.Font("Roboto", 0, 24));
    }//GEN-LAST:event_tfBirthdayMouseClicked

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfNIKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNIKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNIKActionPerformed
    public String getTfUsername() {
        return tfUsername.getText();
    }

    public String getTfPass() {
        return tfPass.getText();
    }

    public Date getTfBirthday() {
        int year,month,day;
        String[] sparate = tfBirthday.getText().split("/");
        year = Integer.valueOf(sparate[2]);
        month = Integer.valueOf(sparate[1]);
        day = Integer.valueOf(sparate[0]);
        return tools.Tools.insertDate(year, month, day);
    }

    public String getTfNama() {
        return tfNama.getText();
    }

    public String getTfEmail() {
        return tfEmail.getText();
    }

    public String getTfNIK() {
        return tfNIK.getText();
    }

    public void addBSignupAdapter(MouseAdapter adapter) {
        bSignup.addMouseListener(adapter);
    }

    public boolean getcb() {
        if (cbKebijakan.isSelected()) {
            dialogcreate.getObj().dispose();
            return true;
        } else {
            return false;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bSignup;
    private javax.swing.JCheckBox cbKebijakan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lSignIn;
    private javax.swing.JPanel pSignupC;
    private javax.swing.JFormattedTextField tfBirthday;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNIK;
    private javax.swing.JTextField tfNama;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
