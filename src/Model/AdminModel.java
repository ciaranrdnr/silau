package Model;

import Controller.Database;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win 10
 */
public class AdminModel{
    
    private String idAdmin;
    private String nama;
    private Date tglLahir;
    private String username;
    private String password;
    private String email;
   
    private Database db;
    private ArrayList<AdminModel> admin = new ArrayList<>();

    public AdminModel(String idAdmin, String nama, Date tglLahir, String username, String email, String password) {
        this.idAdmin = idAdmin;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.username = username;
        this.email = email;
        this.password = password;
        
        db = new Database();
    }

    public AdminModel() {
        db = new Database();
    }

    public AdminModel doLogin(String username, String password){
        db.connect();
        try {
           String query = "SELECT * FROM admin where username = '"+username+"' and password = '"+password+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new AdminModel(db.getRs().getString("idAdmin"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public void loadAdmin(){
        db.connect();
        try {
           String query = "SELECT * FROM admin";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
           admin.add(new AdminModel(db.getRs().getString("idAdmin"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password")));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }
    
    //buat nambahin admin
    public void addAdmin(AdminModel ad) {
        db.connect();
        String query = "INSERT INTO admin VALUES (";
        query += "'" + ad.getIdAdmin() + "',";
        query += "'" + ad.getNama() + "',";
        query += "'" + ad.getTglLahir() + "',";
        query += "'" + ad.getUsername() + "',";
        query += "'" + ad.getEmail() + "',";
        query += "'" + ad.getPassword() + "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            admin.add(ad);
        }
        db.disconnect();
    }

    public boolean cekDuplikatUsername(String username) {
        boolean cek = false;
        for (AdminModel ad : admin) {
            if (ad.getUsername().equals(username)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delAdmin(String idAdmin) {
        db.connect();
        String query = "DELETE FROM admin WHERE idAdmin='" + idAdmin + "'";
        if (db.manipulate(query)) {
            for (AdminModel ad : admin) {
                if (ad.getIdAdmin().equals(idAdmin)) { //ngecek id yang ada didatabase = yang mau dihapus
                    admin.remove(ad);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateAdmin(AdminModel ad) {
        db.connect();
        
        String query = "UPDATE `admin` SET `idAdmin`='"+ad.getIdAdmin()+"',`nama`='"+ad.getNama()+"',`tglLahir`='"+ad.getTglLahir()+"',`username`='"+ad.getUsername()+"',`email`='"+ad.getEmail()+"',`password`='"+ad.getPassword()+"' WHERE `idAdmin`='"+ad.getIdAdmin()+"'";
        System.out.println(query);
        if (db.manipulate(query) ) {
            for (AdminModel adm : admin) {
                if (adm.getIdAdmin().equals(ad.getIdAdmin())){ //ngecek  yang ada didatabase = yang mau dihapus
                    adm.setNama(ad.getNama());
                    adm.setTglLahir(ad.getTglLahir());
                    adm.setUsername(ad.getUsername());
                    adm.setEmail(ad.getEmail());
                    adm.setPassword(ad.getPassword());
                    break;
                }
            }
        }else {
            System.out.println("update gagal");
        }
        db.disconnect();
    }
    
    public AdminModel findViewById(String id){
        db.connect();
        try {
           String query = "SELECT * FROM admin where idAdmin = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new AdminModel(db.getRs().getString("idAdmin"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public AdminModel findViewByNama(String nama){
        db.connect();
        try {
           String query = "SELECT * FROM admin where idAdmin = '"+nama+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new AdminModel(db.getRs().getString("idAdmin"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public ArrayList<AdminModel> getAdmin(){
        return admin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
    

    
    
    
    
}
