/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;

/**
 *
 * @author ciara
 */
public class dArtistU extends javax.swing.JFrame {
private static dArtistU obj=null;
    
    /**
     * Creates new form dArtistU
     */
    public dArtistU() {
        initComponents();
    }
    public static dArtistU getObj(){
        if(obj==null){
           obj= new dArtistU();
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

        jPanel1 = new javax.swing.JPanel();
        pDashboard = new javax.swing.JPanel();
        iconSilau = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        lNama = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Search = new javax.swing.JLabel();
        tracklist = new javax.swing.JLabel();
        bSignout1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pSong2 = new javax.swing.JPanel();
        lSong2 = new javax.swing.JLabel();
        singerIcon = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfAbout = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlbum = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlbum2 = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1349, 724));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 117, 117));
        jPanel1.setPreferredSize(new java.awt.Dimension(1921, 1100));
        jPanel1.setLayout(null);

        pDashboard.setBackground(new java.awt.Color(22, 56, 80));

        iconSilau.setIcon(new javax.swing.ImageIcon("D:\\pictures\\CorelDraw\\lirik\\button\\icon.png")); // NOI18N

        userIcon.setIcon(new javax.swing.ImageIcon("D:\\pictures\\CorelDraw\\lirik\\button\\user.png")); // NOI18N

        lNama.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lNama.setForeground(new java.awt.Color(255, 255, 255));
        lNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNama.setText("12345678901234567890");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Search.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchMousePressed(evt);
            }
        });

        tracklist.setBackground(new java.awt.Color(255, 255, 255));
        tracklist.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        tracklist.setForeground(new java.awt.Color(255, 255, 255));
        tracklist.setText("Tracklist");
        tracklist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tracklistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tracklistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tracklistMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tracklistMousePressed(evt);
            }
        });

        bSignout1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        bSignout1.setForeground(new java.awt.Color(255, 255, 255));
        bSignout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/signoutIcon.png"))); // NOI18N
        bSignout1.setText("Sign Out");
        bSignout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSignout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSignout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSignout1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bSignout1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pDashboardLayout = new javax.swing.GroupLayout(pDashboard);
        pDashboard.setLayout(pDashboardLayout);
        pDashboardLayout.setHorizontalGroup(
            pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDashboardLayout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDashboardLayout.createSequentialGroup()
                        .addComponent(iconSilau)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDashboardLayout.createSequentialGroup()
                        .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDashboardLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(userIcon))
                            .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDashboardLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tracklist)
                                    .addComponent(Search)
                                    .addComponent(bSignout1))))
                        .addGap(54, 54, 54))))
        );
        pDashboardLayout.setVerticalGroup(
            pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDashboardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconSilau)
                .addGap(45, 45, 45)
                .addComponent(userIcon)
                .addGap(18, 18, 18)
                .addComponent(lNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Search)
                .addGap(18, 18, 18)
                .addComponent(tracklist)
                .addGap(247, 247, 247)
                .addComponent(bSignout1)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        jPanel1.add(pDashboard);
        pDashboard.setBounds(0, 0, 370, 1100);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(null);

        pSong2.setBackground(new java.awt.Color(254, 218, 153));

        lSong2.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lSong2.setText("Penyanyi");

        singerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/singer.png"))); // NOI18N

        jScrollPane4.setBackground(new java.awt.Color(254, 218, 153));
        jScrollPane4.setBorder(null);

        tfAbout.setEditable(false);
        tfAbout.setBackground(new java.awt.Color(254, 218, 153));
        tfAbout.setColumns(20);
        tfAbout.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tfAbout.setRows(5);
        tfAbout.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi eros mi, molestie non metus sit amet, laoreet suscipit justo. Etiam dignissim tellus ac sem interdum");
        jScrollPane4.setViewportView(tfAbout);

        javax.swing.GroupLayout pSong2Layout = new javax.swing.GroupLayout(pSong2);
        pSong2.setLayout(pSong2Layout);
        pSong2Layout.setHorizontalGroup(
            pSong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSong2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singerIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pSong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lSong2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        pSong2Layout.setVerticalGroup(
            pSong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSong2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pSong2Layout.createSequentialGroup()
                        .addComponent(lSong2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(singerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pSong2);
        pSong2.setBounds(0, 0, 980, 140);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("Album");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 170, 90, 29);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Song");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 440, 130, 29);

        jScrollPane1.setBorder(null);

        tblAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAlbum);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 470, 880, 200);

        jScrollPane6.setBorder(null);

        jScrollPane3.setBorder(null);

        tblAlbum2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblAlbum2);

        jScrollPane6.setViewportView(jScrollPane3);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(20, 200, 880, 190);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(370, 0, 980, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        searchUserResult.getObj().dispose();
        dArtistU.getObj().dispose();
        searchUser.getObj().setVisible(true);
    }//GEN-LAST:event_SearchMouseClicked

    private void SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseEntered
        Search.setForeground(new Color(210,210,210));
    }//GEN-LAST:event_SearchMouseEntered

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited
        Search.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_SearchMouseExited

    private void SearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMousePressed
        Search.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_SearchMousePressed

    private void tracklistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracklistMouseClicked
        dArtistU.getObj().dispose();
        trackUser.getObj().setVisible(true);
    }//GEN-LAST:event_tracklistMouseClicked

    private void tracklistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracklistMouseEntered
        tracklist.setForeground(new Color(210,210,210));
    }//GEN-LAST:event_tracklistMouseEntered

    private void tracklistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracklistMouseExited
        tracklist.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_tracklistMouseExited

    private void tracklistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracklistMousePressed
        tracklist.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_tracklistMousePressed

    private void bSignout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignout1MouseClicked
        dArtistU.getObj().dispose();
        
    }//GEN-LAST:event_bSignout1MouseClicked

    private void bSignout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignout1MouseEntered
        bSignout1.setForeground(new Color(210,210,210));
    }//GEN-LAST:event_bSignout1MouseEntered

    private void bSignout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignout1MouseExited
        bSignout1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_bSignout1MouseExited

    private void bSignout1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSignout1MousePressed
        bSignout1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_bSignout1MousePressed
    public void setNamaUser(String name){
        lNama.setText(name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    private javax.swing.JLabel bSignout1;
    private javax.swing.JLabel iconSilau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lNama;
    private javax.swing.JLabel lSong2;
    private javax.swing.JPanel pDashboard;
    private javax.swing.JPanel pSong2;
    private javax.swing.JLabel singerIcon;
    private javax.swing.JTable tblAlbum;
    private javax.swing.JTable tblAlbum2;
    private javax.swing.JTextArea tfAbout;
    private javax.swing.JLabel tracklist;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
