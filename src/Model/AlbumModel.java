package Model;

import Controller.Database;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.cAdminViewAl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
/**
 *
 * @author Win 10
 */
public class AlbumModel {

    private String idAlbum;
    private String idPenyanyi;
    private String nama;
    private Date rilis;
    private String genre;
    private String produced;

    private Database db;
    private cAdminViewAl view;
    private ArrayList<AlbumModel> album = new ArrayList<>();
    private penyanyiModel penyanyi;

    public AlbumModel(String idAlbum, String idPenyanyi, String nama, Date rilis, String genre, String produced) {
        this.idAlbum = idAlbum;
        this.idPenyanyi = idPenyanyi;
        this.nama = nama;
        this.rilis = rilis;
        this.genre = genre;
        this.produced = produced;

        db = new Database();
    }

    public AlbumModel() {
        db = new Database();
    }

    public penyanyiModel getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(penyanyiModel penyanyi) {
        this.penyanyi = penyanyi;
    }

    public ArrayList<AlbumModel> loadAlbum() {
        db.connect();
        try {
            String query = "SELECT * FROM album";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                album.add(new AlbumModel(db.getRs().getString("idAlbum"), db.getRs().getString("idPenyanyi"), db.getRs().getString("nama"), db.getRs().getDate("rilis"), db.getRs().getString("genre"), db.getRs().getString("produced")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        db.disconnect();
        return album;
    }

    public void addAlbum(AlbumModel al) {
        System.out.println("sebelum konek");
        db.connect();
        System.out.println("sesudah");
        penyanyiModel pen = new penyanyiModel();
        pen = pen.findViewById(al.getIdPenyanyi());
        if (pen != null) {
            System.out.println("Penyanyi : "+pen.getNama());
            String query = "INSERT INTO album VALUES (";
            query += "'" + al.getIdAlbum() + "',";
            query += "'" + al.getIdPenyanyi() + "',";
            query += "'" + al.getNama() + "',";
            query += "'" + al.getRilis() + "',";
            query += "'" + al.getGenre() + "',";
            query += "'" + al.getProduced() + "'";
            query += ")";
            System.out.println("QUERY = " + query);
            if (db.manipulate(query)) {
                album.add(al);
            }

        }else {
            System.err.println("Penyanyi Not Found");
        }
        db.disconnect();
    }

    public boolean cekDuplikatIdAlbum(String idAlbum) {
        boolean cek = false;
        for (AlbumModel al : album) {
            if (al.getIdAlbum().equals(idAlbum)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delAlbum(String idAlbum) {
        db.connect();
        String query = "DELETE FROM album WHERE idAlbum ='" + idAlbum + "'";
        if (db.manipulate(query)) {
            for (AlbumModel al : album) {
                if (al.getIdAlbum().equals(idAlbum)) { //ngecek id yang ada didatabase = yang mau dihapus
                    album.remove(al);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateAlbum(AlbumModel al) {
        db.connect();
        String query = "UPDATE `album` SET `idAlbum`='"+al.getIdAlbum()+"',`idPenyanyi`='"+al.getIdPenyanyi()+"',`nama`='"+al.getNama()+"',`rilis`='"+al.getRilis()+"',`genre`='"+al.getGenre()+"',`produced`='"+al.getProduced()+"' WHERE `idAlbum`='"+al.getIdAlbum()+"'";        
        if (db.manipulate(query)) {
            for (AlbumModel alb : album) {
                if (alb.getIdAlbum().equals(al.getIdAlbum())) { //ngecek  yang ada didatabase = yang mau dihapus
                    alb.setIdPenyanyi(al.getIdPenyanyi());
                    alb.setNama(al.getNama());
                    alb.setRilis(al.getRilis());
                    alb.setGenre(al.getGenre());
                    alb.setProduced(al.getProduced());

                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public AlbumModel findViewById(String id){
        db.connect();
        try {
            String query = "SELECT * FROM album where idAlbum = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
            return new AlbumModel(db.getRs().getString("idAlbum"), db.getRs().getString("idPenyanyi"), db.getRs().getString("nama"), db.getRs().getDate("rilis"), db.getRs().getString("genre"), db.getRs().getString("produced"));   
           }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
   public List<AlbumModel> findViewByNama(String nama){
       List<AlbumModel> album = new ArrayList<>();
       db.connect();
        try {
            String query = "SELECT * FROM `album` WHERE nama like '%" + nama + "%'";
            db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
               album.add(new AlbumModel(db.getRs().getString("idAlbum"), db.getRs().getString("idPenyanyi"), db.getRs().getString("nama"), db.getRs().getDate("rilis"), db.getRs().getString("genre"), db.getRs().getString("produced")));
           }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return album;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
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

    public Date getRilis() { 
        return rilis;
    }
    public String getStrRilis(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strRilis = dateFormat.format(rilis);  
        return strRilis;
    }

    public void setRilis(Date rilis) {
        this.rilis = rilis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProduced() {
        return produced;
    }

    public void setProduced(String produced) {
        this.produced = produced;
    }

}
