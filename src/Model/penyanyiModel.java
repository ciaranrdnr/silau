package Model;

import Controller.Database;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win 10
 */
public class penyanyiModel {

    private String idPenyanyi;
    private String nama;
    private String about;
    
    private Database db;
    private ArrayList<penyanyiModel> penyanyi = new ArrayList<>();
    
    public penyanyiModel(String idPenyanyi, String nama, String about) {
        this.idPenyanyi = idPenyanyi;
        this.nama = nama;
        this.about = about;
        
        db = new Database();
    }
    
    public penyanyiModel() {
        db = new Database();
    }
    
    public ArrayList<penyanyiModel> loadPenyanyi() {
        db.connect();
        try {
            String query = "SELECT * FROM penyanyi";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                penyanyi.add(new penyanyiModel(db.getRs().getString("idPenyanyi"), db.getRs().getString("nama"), db.getRs().getString("about")));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        db.disconnect();
        return penyanyi;
    }
    
    public void addPenyanyi(penyanyiModel pn) {
        db.connect();
        String query = "INSERT INTO penyanyi VALUES (";
        query += "'" + pn.getIdPenyanyi() + "',";
        query += "'" + pn.getNama() + "',";
        query += "'" + pn.getAbout() + "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            penyanyi.add(pn);
        }
        db.disconnect();
    }
    
    public boolean cekDuplikatIdPenyanyi(String idPenyanyi) {
        boolean cek = false;
        for (penyanyiModel pn : penyanyi) {
            if (pn.getIdPenyanyi().equals(idPenyanyi)) {
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public void delPenyanyi(String idPenyanyi) {
        db.connect();
        String query = "DELETE FROM penyanyi WHERE idPenyanyi ='" + idPenyanyi + "'";
        if (db.manipulate(query)) {
            for (penyanyiModel pn : penyanyi) {
                if (pn.getIdPenyanyi().equals(idPenyanyi)) { //ngecek id yang ada didatabase = yang mau dihapus
                    penyanyi.remove(pn);
                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public penyanyiModel findViewById(String id) {
        db.connect();
        try {
            String query = "SELECT * FROM penyanyi where idPenyanyi = '" + id + "'";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                return new penyanyiModel(db.getRs().getString("idPenyanyi"), db.getRs().getString("nama"), db.getRs().getString("about"));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        db.disconnect();
        
        return null;
    }
    
    public List<penyanyiModel> findViewByNama(String nama) {
        List<penyanyiModel> penyanyi = new ArrayList<>();
        db.connect();
        try {
            String query = "SELECT * FROM `penyanyi` WHERE nama like '%" + nama + "%'";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                penyanyi.add(new penyanyiModel(db.getRs().getString("idPenyanyi"), db.getRs().getString("nama"), db.getRs().getString("about")));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        db.disconnect();
        
        return penyanyi;
    }
    
    public void updateUser(penyanyiModel pn) {
        db.connect();
        String query = "UPDATE `penyanyi` SET `idPenyanyi`='" + pn.getIdPenyanyi() + "',`nama`='" + pn.getNama() + "',`about`='" + pn.getAbout() + "' WHERE `idPenyanyi`='" + pn.getIdPenyanyi() + "'";
        
        if (db.manipulate(query)) {
            for (penyanyiModel pny : penyanyi) {
                if (pny.getIdPenyanyi().equals(pn.getIdPenyanyi())) { //ngecek  yang ada didatabase = yang mau dihapus
                    pny.setNama(pn.getNama());
                    pny.setAbout(pn.getAbout());
                    
                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public String getIdPenyanyi() {
        return idPenyanyi;
    }
    
    public void setIdPenyanyi(String idPenyanyi) {
        this.idPenyanyi = idPenyanyi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAbout() {
        return about;
    }
    
    public void setAbout(String about) {
        this.about = about;
    }
    
    public Database getDb() {
        return db;
    }
    
    public void setDb(Database db) {
        this.db = db;
    }
    
    public ArrayList<penyanyiModel> getPenyanyi() {
        return penyanyi;
    }
    
    public void setPenyanyi(ArrayList<penyanyiModel> penyanyi) {
        this.penyanyi = penyanyi;
    }
    
}
