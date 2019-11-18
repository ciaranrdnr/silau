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
public class DetailTracklistModel {
    private String id_detailTransaksi;
    private String idTracklist;
    private String idLagu;
    
    private Database db;
    private ArrayList<DetailTracklistModel> detail = new ArrayList<>();
    private TracklistModel tracklist = new TracklistModel();
    private LaguModel lagu = new LaguModel();

    public DetailTracklistModel(String id_detailTransaksi, String idTracklist, String idLagu) {
        this.id_detailTransaksi = id_detailTransaksi;
        this.idTracklist = idTracklist;
        this.idLagu = idLagu;
        db = new Database();
    }

    
    public void loadDetailTracklist(){
        db.connect();
        try {
            String query = "SELECT * FROM detailTracklist";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
           detail.add(new DetailTracklistModel(db.getRs().getString("id_detailTracklist"), db.getRs().getString("idTracklist"), db.getRs().getString("idLagu")));   
            }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }
    
    public void addDetail(DetailTracklistModel dt) {
        db.connect();
        String query = "INSERT INTO detailTracklist VALUES (";
        query += "'" + dt.getId_detailTransaksi() + "',";
        query += "'" + dt.getIdTracklist()+ "',";
        query += "'" + dt.getIdLagu()+ "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            detail.add(dt);
        }
        db.disconnect();
    }

    public boolean cekDuplikatIdDetailTracklist(String id_detailTracklist) {
        boolean cek = false;
        for (DetailTracklistModel dt : detail) {
            if (dt.getId_detailTransaksi().equals(id_detailTracklist)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delDetail(String id_detailTracklist) {
        db.connect();
        String query = "DELETE FROM detailTracklist WHERE id_detailTracklist ='" + id_detailTracklist + "'";
        if (db.manipulate(query)) {
            for (DetailTracklistModel dt : detail) {
                if (dt.getId_detailTransaksi().equals(id_detailTracklist)) { //ngecek id yang ada didatabase = yang mau dihapus
                    detail.remove(dt);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateDetailTracklist(DetailTracklistModel dt) {
        db.connect();
        String query = "UPDATE detail SET";
        query += "'" + dt.getIdTracklist()+ "',";
        query += "'" + dt.getIdLagu()+ "'";
        query += "WHERE id_detailTracklist ='" + dt.getId_detailTransaksi()+ "'";
 
        if (db.manipulate(query)) {
            for (DetailTracklistModel dtl : detail) {
                if (dtl.getId_detailTransaksi().equals(dt.getId_detailTransaksi())){ //ngecek  yang ada didatabase = yang mau dihapus
                    dtl.setIdTracklist(dt.getIdTracklist());
                    dtl.setIdLagu(dt.getIdLagu());
                   
                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public DetailTracklistModel findViewById(String id){
        db.connect();
        try {
           String query = "SELECT * FROM detailTracklist where id_detailTracklist = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new DetailTracklistModel(db.getRs().getString("id_detailTracklist"), db.getRs().getString("idTracklist"), db.getRs().getString("idLagu"));   
           }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    public String getId_detailTransaksi() {
        return id_detailTransaksi;
    }

    public void setId_detailTransaksi(String id_detailTransaksi) {
        this.id_detailTransaksi = id_detailTransaksi;
    }

    public String getIdTracklist() {
        return idTracklist;
    }

    public void setIdTracklist(String idTracklist) {
        this.idTracklist = idTracklist;
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

    public ArrayList<DetailTracklistModel> getDetail() {
        return detail;
    }

    public void setDetail(ArrayList<DetailTracklistModel> detail) {
        this.detail = detail;
    }

    public TracklistModel getTracklist() {
        return tracklist;
    }

    public void setTracklist(TracklistModel tracklist) {
        this.tracklist = tracklist;
    }

    public LaguModel getLagu() {
        return lagu;
    }

    public void setLagu(LaguModel lagu) {
        this.lagu = lagu;
    }
    
    
}
