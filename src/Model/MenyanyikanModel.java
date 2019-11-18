package Model;

import Controller.Database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win 10
 */
public class MenyanyikanModel {
    private String idMenyanyikan;
    private String idPenyanyi;
    private String idLagu;

    private Database db;
    private ArrayList<MenyanyikanModel> menyanyi = new ArrayList<>();
    private penyanyiModel penyanyi = new penyanyiModel();
    private LaguModel lagu = new LaguModel();

    public MenyanyikanModel(String idMenyanyikan, String idPenyanyi, String idLagu) {
        this.idMenyanyikan = idMenyanyikan;
        this.idPenyanyi = idPenyanyi;
        this.idLagu = idLagu;
        db = new Database();
    }
    
    public void loadMenyanyikan(){
        db.connect();
        try {
            String query = "SELECT * FROM menyanyikan";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
           menyanyi.add(new MenyanyikanModel(db.getRs().getString("idMenyanyikan"), db.getRs().getString("idPenyanyi"), db.getRs().getString("idLagu")));   
            }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }
    
    public void addMenyanyi(MenyanyikanModel mn) {
        db.connect();
        String query = "INSERT INTO menyanyikan VALUES (";
        query += "'" + mn.getIdMenyanyikan() + "',";
        query += "'" + mn.getIdPenyanyi() + "',";
        query += "'" + mn.getIdLagu()+ "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            menyanyi.add(mn);
        }
        db.disconnect();
    }

    public boolean cekDuplikatIdMenyanyikan(String idMenyanyikan) {
        boolean cek = false;
        for (MenyanyikanModel mn : menyanyi) {
            if (mn.getIdMenyanyikan().equals(idMenyanyikan)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delMenyanyi(String idMenyanyikan) {
        db.connect();
        String query = "DELETE FROM menyanyikan WHERE idMenyanyikan ='" + idMenyanyikan + "'";
        if (db.manipulate(query)) {
            for (MenyanyikanModel mn : menyanyi) {
                if (mn.getIdMenyanyikan().equals(idMenyanyikan)) { //ngecek id yang ada didatabase = yang mau dihapus
                    menyanyi.remove(mn);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateMenyanyikan(MenyanyikanModel mn) {
        db.connect();
        String query = "UPDATE menyanyikan SET";
        query += "'" + mn.getIdPenyanyi()+ "',";
        query += "'" + mn.getIdLagu()+ "'";
        query += "WHERE idMenyanyikan ='" + mn.getIdMenyanyikan()+ "'";
 
        if (db.manipulate(query)) {
            for (MenyanyikanModel mny : menyanyi) {
                if (mny.getIdMenyanyikan().equals(mn.getIdMenyanyikan())){ //ngecek  yang ada didatabase = yang mau dihapus
                    mny.setIdPenyanyi(mn.getIdPenyanyi());
                    mny.setIdLagu(mn.getIdLagu());
                   
                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public MenyanyikanModel findViewById(String id){
        db.connect();
        try {
           String query = "SELECT * FROM menyanyikan where idMenyanyikan = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new MenyanyikanModel(db.getRs().getString("idMenyanyikan"), db.getRs().getString("idPenyanyi"), db.getRs().getString("idLagu"));   
           }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }

    public String getIdMenyanyikan() {
        return idMenyanyikan;
    }

    public void setIdMenyanyikan(String idMenyanyikan) {
        this.idMenyanyikan = idMenyanyikan;
    }

    public String getIdPenyanyi() {
        return idPenyanyi;
    }

    public void setIdPenyanyi(String idPenyanyi) {
        this.idPenyanyi = idPenyanyi;
    }

    public String getIdLagu() {
        return idLagu;
    }

    public void setIdLagu(String idLagu) {
        this.idLagu = idLagu;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public ArrayList<MenyanyikanModel> getMenyanyi() {
        return menyanyi;
    }

    public void setMenyanyi(ArrayList<MenyanyikanModel> menyanyi) {
        this.menyanyi = menyanyi;
    }

    public penyanyiModel getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(penyanyiModel penyanyi) {
        this.penyanyi = penyanyi;
    }

    public LaguModel getLagu() {
        return lagu;
    }

    public void setLagu(LaguModel lagu) {
        this.lagu = lagu;
    }
    
    
    
}
