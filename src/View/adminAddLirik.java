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
public class adminAddLirik extends javax.swing.JFrame {

    /**
     * Creates new form adminAddLirik
     */
    public adminAddLirik() {
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

        pLoginL = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfIDlirik = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        bSubmit = new javax.swing.JPanel();
        arrRight = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfLirik = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 622));
        setResizable(false);

        pLoginL.setBackground(new java.awt.Color(255, 255, 255));
        pLoginL.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        tfIDlirik.setBackground(new java.awt.Color(249, 249, 249));
        tfIDlirik.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfIDlirik.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfIDlirik, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfIDlirik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pLoginL.add(jPanel2);
        jPanel2.setBounds(40, 160, 440, 60);

        id.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        id.setText("ID Lirik");
        pLoginL.add(id);
        id.setBounds(50, 130, 120, 29);

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
        bSubmit.setBounds(520, 300, 70, 160);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setText("Add Lirik");
        pLoginL.add(jLabel1);
        jLabel1.setBounds(200, 50, 240, 50);

        jScrollPane1.setBorder(null);

        tfLirik.setBackground(new java.awt.Color(249, 249, 249));
        tfLirik.setColumns(20);
        tfLirik.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tfLirik.setRows(5);
        tfLirik.setBorder(null);
        jScrollPane1.setViewportView(tfLirik);

        pLoginL.add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 440, 310);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLoginL, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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
    public String getTfIDLirik() {
        return tfIDlirik.getText();
    }

    public String getTfLirik() {
        return tfLirik.getText();
    }
    public void addBSubmitAdapter(MouseAdapter adapter) {
        bSubmit.addMouseListener(adapter);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrRight;
    private javax.swing.JPanel bSubmit;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pLoginL;
    private javax.swing.JTextField tfIDlirik;
    private javax.swing.JTextArea tfLirik;
    // End of variables declaration//GEN-END:variables
}