/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LaguModel;
import View.adminVSong;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ciara
 */
public class cAdminVS {
    adminVSong view;
    public ArrayList<LaguModel> lists; 
    LaguModel lagu;
    
    

    public cAdminVS() {
        view = new adminVSong();
        lagu = new LaguModel();
        
        view.setVisible(true);
        lists = new ArrayList<>();
        initComponents();
        loadAll();
    }

    
    public void loadAll() {
        System.out.println("loadallus");
        //lists.clear();
        this.lists = lagu.loadLagu();
        System.out.println("sblm loadtab");
        loadToTable();
        System.out.println("sesudah loadtab");
    }
    
    public void loadToTable() {
       DefaultTableModel dtm = new DefaultTableModel();
        System.out.println("msk loadtab");
        dtm.setColumnCount(2);
        dtm.setColumnIdentifiers(new String[]{"Judul", "Fun Fact"});
        System.out.println("nambah kolom");
        
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(i);
            dtm.addRow(new String[]{lists.get(i).getJudul(), lists.get(i).getFunFact()
                    }
                    );
        }
        System.out.println("keluar");
        view.gettblSong().setModel(dtm);
    }
    
    private void initComponents() {


}


    }

