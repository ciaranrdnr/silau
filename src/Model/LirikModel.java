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
public class LirikModel {

    private String idLirik;
    private String detailLirik;
//    private String intro;
//    private String preChorus;
//    private String chorus;
//    private String outro;

    private Database db;
    private ArrayList<LirikModel> lirik = new ArrayList<>();
    private LaguModel lagu;

    public LirikModel(String idLirik, String detailLirik) {
        this.idLirik = idLirik;
        this.detailLirik = detailLirik;
        db = new Database();
    }

    
    /*public LirikModel(String idLirik, String intro, String preChorus, String chorus, String outro) {
        this.idLirik = idLirik;
        this.intro = intro;
        this.preChorus = preChorus;
        this.chorus = chorus;
        this.outro = outro;
        db = new Database();
    }*/

    public ArrayList<LirikModel> getLirik() {
        return lirik;
    }

    public LirikModel() {
        db = new Database();
    }

    public LaguModel getLagu() {
        return lagu;
    }

    public void setLagu(LaguModel lagu) {
        this.lagu = lagu;
    }

    public void loadLirik() {
        db.connect();
        try {
            String query = "SELECT * FROM lirik";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                lirik.add(new LirikModel(db.getRs().getString("idLirik"), db.getRs().getString("detailLirik")));
//                lirik.add(new LirikModel(db.getRs().getString("idLirik"), db.getRs().getString("intro"), db.getRs().getString("preChorus"), db.getRs().getString("chorus"), db.getRs().getString("outro")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }

    public void addLirik(LirikModel lr) {
        db.connect();
        LaguModel song = new LaguModel();
        song = song.findViewById(lr.idLirik);
        if (song != null) {
                String query = "INSERT INTO lirik VALUES (";
                query += "'" + lr.getIdLirik() + "',";
                query += "'" + lr.getDetailLirik() + "'";
//                query += "'" + lr.getIntro() + "',";
//                query += "'" + lr.getPreChorus() + "',";
//                query += "'" + lr.getChorus() + "',";
//                query += "'" + lr.getOutro() + "'";
                query += ")";
                System.out.println("QUERY = " + query);
                if (db.manipulate(query)) {
                    lirik.add(lr);
                }
            
        } else {
            System.err.println("Lagu Not Found");
        }
        db.disconnect();
    }

    public boolean cekDuplikatIdLirik(String idLirik) {
        boolean cek = false;
        for (LirikModel lr : lirik) {
            if (lr.getIdLirik().equals(idLirik)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delLirik(String idLirik) {
        db.connect();
        String query = "DELETE FROM lirik WHERE idLirik ='" + idLirik + "'";
        if (db.manipulate(query)) {
            for (LirikModel lr : lirik) {
                if (lr.getIdLirik().equals(idLirik)) { //ngecek id yang ada didatabase = yang mau dihapus
                    lirik.remove(lr);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateLirik(LirikModel lr) {
        db.connect();
        String query = "UPDATE `lirik` SET `idLirik`='"+lr.getIdLirik()+"',`detailLirik`='"+lr.getDetailLirik()+"' WHERE `idLirik`='"+lr.getIdLirik()+"'";
//        String query = "UPDATE `lirik` SET `idLirik`='"+lr.getIdLirik()+"',`intro`='"+lr.getIntro()+"',`preChorus`='"+lr.getPreChorus()+"',`chorus`='"+lr.getChorus()+"',`outro`='"+lr.getOutro()+"' WHERE `idLirik`='"+lr.getIdLirik()+"'";
        
        if (db.manipulate(query)) {
            for (LirikModel lrk : lirik) {
                if (lrk.getIdLirik().equals(lr.getIdLirik())) { //ngecek  yang ada didatabase = yang mau dihapus
                      lrk.setDetailLirik(lr.getDetailLirik());
//                    lrk.setIntro(lr.getIntro());
//                    lrk.setPreChorus(lr.getPreChorus());
//                    lrk.setChorus(lr.getChorus());
//                    lrk.setOutro(lr.getOutro());

                    break;
                }
            }
        }
        db.disconnect();
    }

    public LirikModel findViewById(String id) {
        db.connect();
        try {
   
            String query = "SELECT * FROM lirik where idLirik = '" + id + "'";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                return new LirikModel(db.getRs().getString("idLirik"), db.getRs().getString("detailLirik"));
//                return new LirikModel(db.getRs().getString("idLirik"), db.getRs().getString("intro"), db.getRs().getString("preChorus"), db.getRs().getString("chorus"), db.getRs().getString("outro"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }

    public List<LirikModel> findViewByLirik(String search) {
        List<LirikModel> lirik = new ArrayList<>();
        db.connect();
        lirik.clear();
        try {
            String query = "SELECT * FROM `lirik` NATURAL JOIN lagu WHERE detailLirik like '%"+search+"%'GROUP BY idLagu";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                LirikModel result = new LirikModel(db.getRs().getString("idLirik"), db.getRs().getString("detailLirik"));
                result.setLagu(new LaguModel(db.getRs().getString("idLagu"), db.getRs().getString("idAlbum"), db.getRs().getString("idAdmin"), db.getRs().getString("judul"), db.getRs().getString("funFact"), db.getRs().getInt("seen")));
                lirik.add(result);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return lirik;
    }
    
    public String getIdLirik() {
        return idLirik;
    }

    public void setIdLirik(String idLirik) {
        this.idLirik = idLirik;
    }
    
    

    /*public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPreChorus() {
        return preChorus;
    }

    public void setPreChorus(String preChorus) {
        this.preChorus = preChorus;
    }

    public String getChorus() {
        return chorus;
    }

    public void setChorus(String chorus) {
        this.chorus = chorus;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }*/

    public String getDetailLirik() {
        return detailLirik;
    }

    public void setDetailLirik(String detailLirik) {
        this.detailLirik = detailLirik;
    }
    

}
