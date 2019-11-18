/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.penyanyiModel;
import View.adminAddAlbum;
import View.adminAddArtist;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ciara
 */
public class cAdminAddAr {
    adminAddArtist view;
    penyanyiModel model;

    public cAdminAddAr() {
        view = new adminAddArtist();
        model = new penyanyiModel();
        view.setVisible(true);
        initComponents();
    }
    public void onClickAddAr() {
        System.out.println("masuk");
        if (isAddValid()) {
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Penyanyi");
            view.dispose();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Penyanyi");
        }
    }

    public Boolean isAddValid() {
        boolean isValid = true;
        if (view.getaddIDA().equals("")) {
            return false;
        }
        if (view.getaddNameA().equals("")) {
            return false;
        }
        if (view.getaddaboutA().equals("")) {
            return false;
        }
        System.out.println(view.getaddIDA()+ view.getaddNameA()+view.getaddaboutA());
        model.addPenyanyi(new penyanyiModel(view.getaddIDA(), view.getaddNameA(), view.getaddaboutA()));
        return isValid;
    }
    
    private void initComponents() {
        view.addBSubmitAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onClickAddAr(); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }    
        
    
}
