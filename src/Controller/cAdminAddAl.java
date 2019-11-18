/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlbumModel;
import Model.penyanyiModel;
import View.adminAddAlbum;
import View.searchUser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ciara
 */
public class cAdminAddAl {
    adminAddAlbum view;
    AlbumModel model;
    penyanyiModel penyanyi;
    public ArrayList<penyanyiModel> lists; 
    String idPenyanyi;

    public cAdminAddAl() {
        view = new adminAddAlbum();
        model =new AlbumModel();
        view.setVisible(true);
        lists = new ArrayList<>();
        penyanyi = new penyanyiModel();
        loadAll();
        initComponents();
    }
public void onClickAddAl() {
        System.out.println("masuk");
        if (isAddAlValid()) {
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Penyanyi");
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Penyanyi");
        }
        System.out.println("masuk on click");
    }

    public Boolean isAddAlValid() {
        boolean isValid = true;
        if (view.getTfIDAlbum().equals("")) {
            return false;
        }
        if (view.getTfName().equals("")) {
            return false;
        }
        if (view.getTfGenre().equals("")) {
            return false;
        }
        if (view.getTfProduser().equals("")) {
            return false;
        }
        System.out.println(view.getTfIDAlbum()+ view.getTfName()+view.getTfRilis()+view.getTfGenre()+view.getTfProduser());
        model.addAlbum(new AlbumModel(view.getTfIDAlbum(), idPenyanyi , view.getTfName(), view.getTfRilis(), view.getTfGenre(), view.getTfProduser()));
        System.out.println("VALID GA YA:"+isValid);
        
        return isValid;
    }
    
    
    
    public void loadAll() {
        System.out.println("loadallus");
        this.lists = penyanyi.loadPenyanyi();
        System.out.println("sblm loadtab");
        loadToTable();
        System.out.println("sesudah loadtab");
    }
    
    public void loadToTable() {
       DefaultTableModel dtm = new DefaultTableModel();
        System.out.println("msk loadtab");
        dtm.setColumnCount(2);
        dtm.setColumnIdentifiers(new String[]{"Nama", "About"});
        System.out.println("nambah kolom");
        
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(i);
            dtm.addRow(new String[]{lists.get(i).getNama(), lists.get(i).getAbout()
                    }
                    );
        }
        System.out.println("keluar");
        view.gettblArtist().setModel(dtm);
    }
    private void initComponents() {
        view.addBSubmitAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onClickAddAl(); //To change body of generated methods, choose Tools | Templates.
            }

        });
        view.setbPenyanyi(new MouseAdapter() {
            //String idPenyanyi  = lists.get(0);
        });
        
                
        
    }   
    
}
