package Model;

import Controller.Database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win 10
 */
public class LaguModel {

    private String idLagu;
    private String idAlbum;
    private String idAdmin;
    private String judul;
    private String funFact;
    private int seen;

    private Database db;
    private ArrayList<LaguModel> lagu = new ArrayList<>();
    private AlbumModel album = new AlbumModel();
    private AdminModel admin = new AdminModel();

    public LaguModel(String idLagu, String idAlbum, String idAdmin, String judul, String funFact, int seen) {
        this.idLagu = idLagu;
        this.idAlbum = idAlbum;
        this.idAdmin = idAdmin;
        this.judul = judul;
        this.funFact = funFact;
        this.seen = seen;
        db = new Database();
    }

    public LaguModel() {
        db = new Database();
    }

    public ArrayList<LaguModel> loadLagu() {
        db.connect();
        try {
            String query = "SELECT * FROM lagu";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                lagu.add(new LaguModel(db.getRs().getString("idLagu"), db.getRs().getString("idAlbum"), db.getRs().getString("idAdmin"), db.getRs().getString("judul"), db.getRs().getString("funFact"), db.getRs().getInt("seen")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return lagu;
    }

    public void addLagu(LaguModel lg) {
        db.connect();
        String query = "INSERT INTO lagu VALUES (";
        query += "'" + lg.getIdLagu() + "',";
        if (lg.getIdAlbum() == null) {
            query += "" + lg.getIdAlbum() + ",";
        } else {
            query += "'" + lg.getIdAlbum() + "',";
        }
        query += "'" + lg.getIdAdmin() + "',";
        query += "'" + lg.getJudul() + "',";
        query += "'" + lg.getFunFact() + "',";
        query += "'" + lg.getSeen() + "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            lagu.add(lg);
        }
        db.disconnect();
    }

    public boolean cekDuplikatIdLagu(String idLagu) {
        boolean cek = false;
        for (LaguModel lg : lagu) {
            if (lg.getIdLagu().equals(idLagu)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delLagu(String idLagu) {
        db.connect();
        String query = "DELETE FROM lagu WHERE idLagu ='" + idLagu + "'";
        if (db.manipulate(query)) {
            for (LaguModel lg : lagu) {
                if (lg.getIdLagu().equals(idLagu)) { //ngecek id yang ada didatabase = yang mau dihapus
                    lagu.remove(lg);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateLagu(LaguModel lg) {
        db.connect();
        String query = "UPDATE `lagu` SET `idLagu`='"+lg.getIdLagu()+"',`idAlbum`='"+lg.getIdAlbum()+"',`idAdmin`='"+lg.getIdAdmin()+"',`judul`='"+lg.getJudul()+"',`funFact`='"+lg.getFunFact()+"',`seen`='"+lg.getSeen()+"' WHERE `idLagu`='"+lg.getIdLagu()+"'";
     
        if (db.manipulate(query)) {
            for (LaguModel lgu : lagu) {
                if (lgu.getIdLagu().equals(lg.getIdLagu())) { //ngecek  yang ada didatabase = yang mau dihapus
                    lgu.setIdAlbum(lg.getIdAlbum());
                    lgu.setIdAdmin(lg.getIdAdmin());
                    lgu.setJudul(lg.getJudul());
                    lgu.setFunFact(lg.getFunFact());
                    lgu.setSeen(lg.getSeen());

                    break;
                }
            }
        }
        db.disconnect();
    }

    public LaguModel findViewById(String id){
        db.connect();
        try {
            String query = "SELECT * FROM lagu where idLagu = '"+id+"'";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                return new LaguModel(db.getRs().getString("idLagu"), db.getRs().getString("idAlbum"), db.getRs().getString("idAdmin"), db.getRs().getString("judul"), db.getRs().getString("funFact"), db.getRs().getInt("seen"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public List<LaguModel> findViewByJudul(String judul){
        List<LaguModel> lagu = new ArrayList<>();
        db.connect();
        try {
            String query = "SELECT * FROM `lagu` WHERE judul like '%"+judul+"%'";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                lagu.add(new LaguModel(db.getRs().getString("idLagu"), db.getRs().getString("idAlbum"), db.getRs().getString("idAdmin"), db.getRs().getString("judul"), db.getRs().getString("funFact"), db.getRs().getInt("seen")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        
        return lagu;
    }
    
    public String getIdLagu() {
        return idLagu;
    }

    public void setIdLagu(String idLagu) {
        this.idLagu = idLagu;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public int getSeen() {
        return seen;
    }

    public void setSeen(int seen) {
        this.seen = seen;
    }

}
