/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
    
import Model.LirikModel;
import View.adminAddLirik;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

    
/**
 *
 * @author ciara
 */
public class cAdminAddLrk {
    adminAddLirik view;
    LirikModel model;
    

    public cAdminAddLrk() {
        view = new adminAddLirik();
        model = new LirikModel();
        view.setVisible(true);
        initComponents();
    }
    public void onClickAddLrk() {
        System.out.println("masuk");
        if (isAddValid()) {
            model.addLirik(new LirikModel(view.getTfIDLirik(), view.getTfLirik()));
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Lirik");
            view.dispose();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Lirik");
        }
    }

    public Boolean isAddValid() {
        boolean isValid = true;
        if (view.getTfLirik().equals("")) {
            return false;
        }
        if (view.getTfIDLirik().equals("")) {
            return false;
        }
        System.out.println(view.getTfIDLirik()+ view.getTfLirik());
        return isValid;
    }

    private void initComponents() {
        view.addBSubmitAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onClickAddLrk(); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
}
