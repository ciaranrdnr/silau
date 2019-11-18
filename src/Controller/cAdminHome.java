/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlbumModel;
import View.adminHome;
import View.adminVAl;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author ciara
 */
public class cAdminHome {
    adminHome view;
    

    public cAdminHome() {
        view = new adminHome();
        view.setVisible(true);
        initComponents();
    }

    private void initComponents() {
        view.addbAddArtist(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cAdminAddAr();
            }
        
    });
        view.addbAddSong(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cAdminAddLrk();
                new cAdminAddS(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        view.addbAddAlbum(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cAdminAddAl(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        view.addbViewAlbum(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cAdminViewAl();
            }
            
        
        
        });
        view.addbViewArt(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cAdminVAr(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        view.addbViewS(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cAdminVS(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
                }
    
    
    
}
