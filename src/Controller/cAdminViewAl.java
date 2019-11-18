package Controller;

import Model.AlbumModel;
import View.adminVAl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import Model.AlbumModel;
import java.awt.event.MouseEvent;

/**
 *
 * @author ciara
 */
public class cAdminViewAl{
    public adminVAl view;
    //Database db;
    public ArrayList<AlbumModel> lists; 
    public AlbumModel album;
        
    public cAdminViewAl() {
        view = new adminVAl();
        album =new AlbumModel();
        view.setVisible(true);
        lists = new ArrayList<>();
        initComponents();
        System.out.println("blm masuk");
        loadAll();
        System.out.println("udhmsk");
    }
    
    
    public void loadAll() {
        System.out.println("loadallus");
        //lists.clear();
        this.lists = album.loadAlbum();
        System.out.println("sblm loadtab");
        loadToTable();
        System.out.println("sesudah loadtab");
    }
    
    public void loadToTable() {
       DefaultTableModel dtm = new DefaultTableModel();
        System.out.println("msk loadtab");
        dtm.setColumnCount(4);
        dtm.setColumnIdentifiers(new String[]{"nama", "rilis","genre","produced"});
        System.out.println("nambah kolom");
        
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(i);
            System.out.println("ini rilis:"+lists.get(i).getStrRilis());
            dtm.addRow(new String[]{lists.get(i).getNama(), lists.get(i).getStrRilis(), lists.get(i).getGenre(),lists.get(i).getProduced()
                    }
                    );
        }
        System.out.println("keluar");
        view.gettblAlbum().setModel(dtm);
    }
    
    private void initComponents() {


}


}