/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LaguModel;
import View.adminAddSong;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ciara
 */
public class cAdminAddS {
    adminAddSong view;
    LaguModel model;

    public cAdminAddS() {
        view = new adminAddSong();
        model = new LaguModel();
        view.setVisible(true);
        initComponents();
    }
    public void onClickAddS() {
        System.out.println("masuk");
        if (isAddValid()) {
            model.addLagu(new LaguModel(view.gettfIDLagu(), "123456780", "1301174385", view.getTfJudul(), view.getTfFunFact(), 0));
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Lagu");
            view.dispose();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Lagu");
        }
    }

    public Boolean isAddValid() {
        boolean isValid = true;
        if (view.gettfIDLagu().equals("")) {
            return false;
        }
        if (view.getTfJudul().equals("")) {
            return false;
        }
        if (view.getTfFunFact().equals("")) {
            return false;
        }
        System.out.println(view.gettfIDLagu()+view.getName()+view.getTfFunFact());
        
        System.out.println(isValid);
        return isValid;
    }

    private void initComponents() {
        view.addBSubmitAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onClickAddS(); //To change body of generated methods, choose Tools | Templates.
                System.out.println(isAddValid());
            }

        });
}}
