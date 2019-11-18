/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.penyanyiModel;
import View.adminVAr;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ciara
 */
public class cAdminVAr {
    adminVAr view;
    penyanyiModel model;
    public ArrayList<penyanyiModel> lists;
    penyanyiModel penyanyi;

    public cAdminVAr() {
        view = new adminVAr();
        view.setVisible(true);
        initComponents();
        penyanyi = new penyanyiModel();
        lists = new ArrayList<>();
        loadAll();
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
    }
}

