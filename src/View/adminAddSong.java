/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.MouseAdapter;

/**
 *
 * @author ciara
 */
public class adminAddSong extends javax.swing.JFrame {
private static adminAddSong obj=null;
    
    public adminAddSong() {
        initComponents();
    }
    public static adminAddSong getObj(){
        if(obj==null){
           obj= new adminAddSong();
        }return obj;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLoginL = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfIDLagu = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfJudul = new javax.swing.JTextField();
        bSubmit = new javax.swing.JPanel();
        arrRight = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfFunFact = new javax.swing.JTextField();
        judul1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(620, 562));
        setResizable(false);

        pLoginL.setBackground(new java.awt.Color(255, 255, 255));
        pLoginL.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        tfIDLagu.setBackground(new java.awt.Color(249, 249, 249));
        tfIDLagu.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfIDLagu.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfIDLagu, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfIDLagu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pLoginL.add(jPanel2);
        jPanel2.setBounds(40, 160, 440, 60);

        id.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        id.setText("ID Lagu");
        pLoginL.add(id);
        id.setBounds(50, 130, 120, 29);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        tfJudul.setBackground(new java.awt.Color(249, 249, 249));
        tfJudul.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfJudul.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pLoginL.add(jPanel1);
        jPanel1.setBounds(40, 250, 440, 60);

        bSubmit.setBackground(new java.awt.Color(254, 182, 53));
        bSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSubmitMouseExited(evt);
            }
        });

        arrRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/arrowright.png"))); // NOI18N

        javax.swing.GroupLayout bSubmitLayout = new javax.swing.GroupLayout(bSubmit);
        bSubmit.setLayout(bSubmitLayout);
        bSubmitLayout.setHorizontalGroup(
            bSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bSubmitLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(arrRight)
                .addGap(23, 23, 23))
        );
        bSubmitLayout.setVerticalGroup(
            bSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bSubmitLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(arrRight)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pLoginL.add(bSubmit);
        bSubmit.setBounds(520, 220, 70, 160);

        judul.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        judul.setText("Judul Lagu");
        pLoginL.add(judul);
        judul.setBounds(50, 220, 120, 29);

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));

        tfFunFact.setBackground(new java.awt.Color(249, 249, 249));
        tfFunFact.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfFunFact.setBorder(null);
        tfFunFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFunFactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfFunFact, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfFunFact, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        pLoginL.add(jPanel3);
        jPanel3.setBounds(40, 350, 440, 140);

        judul1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        judul1.setText("Fun Fact");
        pLoginL.add(judul1);
        judul1.setBounds(50, 320, 120, 29);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setText("Add Song");
        pLoginL.add(jLabel1);
        jLabel1.setBounds(200, 50, 240, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLoginL, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLoginL, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bSubmitMouseClicked

    private void bSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSubmitMouseEntered
        bSubmit.setBackground(new Color(255, 197, 91));
    }//GEN-LAST:event_bSubmitMouseEntered

    private void bSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSubmitMouseExited
        bSubmit.setBackground(new Color(254, 182, 53));
    }//GEN-LAST:event_bSubmitMouseExited

    private void tfFunFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFunFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFunFactActionPerformed
    public String gettfIDLagu() {
        return tfIDLagu.getText();
    }

    public String getTfJudul() {
        return tfJudul.getText();
    }

    public String getTfFunFact() {
        return tfFunFact.getText();
    }
    public void addBSubmitAdapter(MouseAdapter adapter) {
        bSubmit.addMouseListener(adapter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrRight;
    private javax.swing.JPanel bSubmit;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judul1;
    private javax.swing.JPanel pLoginL;
    private javax.swing.JTextField tfFunFact;
    private javax.swing.JTextField tfIDLagu;
    private javax.swing.JTextField tfJudul;
    // End of variables declaration//GEN-END:variables
}