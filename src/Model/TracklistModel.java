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
public class TracklistModel {
    private String idTracklist;
    private String nama;
    private String idUser;

    private Database db;
    private ArrayList<TracklistModel> tracklist = new ArrayList<>();
    private UserModel user = new UserModel();

    public TracklistModel(String idTracklist, String nama, String idUser) {
        this.idTracklist = idTracklist;
        this.nama = nama;
        this.idUser = idUser;
        db = new Database();
    }

    public TracklistModel() {
       db = new Database();
    }

    public void loadTracklist(){
        db.connect();
        try {
            String query = "SELECT * FROM tracklist";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
           tracklist.add(new TracklistModel(db.getRs().getString("idTracklist"), db.getRs().getString("nama"), db.getRs().getString("idUser")));   
            }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }
    
    public void addTracklist(TracklistModel tr) {
        db.connect();
        String query = "INSERT INTO tracklist VALUES (";
        query += "'" + tr.getIdTracklist() + "',";
        query += "'" + tr.getNama() + "',";
        query += "'" + tr.getIdUser()+ "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            tracklist.add(tr);
        }
        db.disconnect();
    }

    public boolean cekDuplikatIdTracklist(String idTracklist) {
        boolean cek = false;
        for (TracklistModel tr : tracklist) {
            if (tr.getIdTracklist().equals(idTracklist)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delTracklist(String idTracklist) {
        db.connect();
        String query = "DELETE FROM tracklist WHERE idTracklist ='" + idTracklist + "'";
        if (db.manipulate(query)) {
            for (TracklistModel tr : tracklist) {
                if (tr.getIdTracklist().equals(idTracklist)) { //ngecek id yang ada didatabase = yang mau dihapus
                    tracklist.remove(tr);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateUser(TracklistModel tr) {
        db.connect();
        String query = "UPDATE `tracklist` SET `idTracklist`='"+tr.getIdTracklist()+"',`nama`='"+tr.getNama()+"',`idUser`='"+tr.getIdUser()+"' WHERE `idTracklist`='"+tr.getIdTracklist()+"'";
        
        if (db.manipulate(query)) {
            for (TracklistModel trl : tracklist) {
                if (trl.getIdTracklist().equals(tr.getIdTracklist())){ //ngecek  yang ada didatabase = yang mau dihapus
                    trl.setNama(tr.getNama());
                    trl.setIdUser(tr.getIdUser());
                   
                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public TracklistModel findViewById(String id){
        db.connect();
        try {
           String query = "SELECT * FROM penyanyi where idPenyanyi = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new TracklistModel(db.getRs().getString("idTracklist"), db.getRs().getString("nama"), db.getRs().getString("idUser"));   
           }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public TracklistModel findViewByNama(String nama){
        db.connect();
        try {
           String query = "SELECT * FROM penyanyi where idPenyanyi = '"+nama+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new TracklistModel(db.getRs().getString("idTracklist"), db.getRs().getString("nama"), db.getRs().getString("idUser"));   
           }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public String getIdTracklist() {
        return idTracklist;
    }

    public void setIdTracklist(String idTracklist) {
        this.idTracklist = idTracklist;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    
}
