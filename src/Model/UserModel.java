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
public class UserModel {
    private String idUser;
    private String nama;
    private Date tglLahir;
    private String username;
    private String email;
    private String password;
    
    private Database db;
    private ArrayList<UserModel> user = new ArrayList<>();


    public UserModel(String idUser, String nama, Date tglLahir, String username, String email, String password) {
        this.idUser = idUser;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.username = username;
        this.email = email;
        this.password = password;
        
        db = new Database();
    }

    public UserModel() {
        db = new Database();
    }
    
    public void loadUser(){
        db.connect();
        try {
           String query = "SELECT * FROM user";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
           user.add(new UserModel(db.getRs().getString("idUser"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password")));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }
    
    public void addUser(UserModel us) {
        db.connect();
        String query = "INSERT INTO user VALUES (";
        query += "'" + us.getIdUser() + "',";
        query += "'" + us.getNama() + "',";
        query += "'" + us.getTglLahir() + "',";
        query += "'" + us.getUsername() + "',";
        query += "'" + us.getEmail() + "',";
        query += "'" + us.getPassword() + "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            user.add(us);
        }
        db.disconnect();
    }

    public boolean cekDuplikatUsername(String username) {
        boolean cek = false;
        for (UserModel us : user) {
            if (us.getUsername().equals(username)) {
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    
    
    public void delUser(String idUser) {
        db.connect();
        String query = "DELETE FROM user WHERE idUser ='" + idUser + "'";
        if (db.manipulate(query)) {
            for (UserModel us : user) {
                if (us.getIdUser().equals(idUser)) { //ngecek idUser yang ada didatabase = yang mau dihapus
                    user.remove(us);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateUser(UserModel us) {
        db.connect();
        String query = "UPDATE `user` SET `idUser`='"+us.getIdUser()+"',`nama`='"+us.getNama()+"',`tglLahir`='"+us.getTglLahir()+"',`username`='"+us.getUsername()+"',`email`='"+us.getEmail()+"',`password`='"+us.getPassword()+"' WHERE `idUser`='"+us.getIdUser()+"'";
        
        if (db.manipulate(query)) {
            for (UserModel usr : user) {
                if (usr.getIdUser().equals(us.getIdUser())){ //ngecek  yang ada didatabase = yang mau dihapus
                    usr.setNama(us.getNama());
                    usr.setTglLahir(us.getTglLahir());
                    usr.setUsername(us.getUsername());
                    usr.setEmail(us.getEmail());
                    usr.setPassword(us.getPassword());
                    break;
                }
            }
        }
        db.disconnect();
    }
    
    public UserModel findViewById(String id){
        db.connect();
        try {
           String query = "SELECT * FROM user where idUser = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
            return new UserModel(db.getRs().getString("idUser"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }

    public List<UserModel> findViewByNama(String nama){
        List<UserModel> user = new ArrayList<>();
        db.connect();
        try {
            String query = "SELECT * FROM `user` WHERE nama like '%" + nama + "%'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                user.add(new UserModel(db.getRs().getString("idUser"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password")));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return user;
    }
    
    public UserModel doLogin(String username, String password){
        db.connect();
        try {
           String query = "SELECT * FROM user where username = '"+username+"' and password = '"+password+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                return new UserModel(db.getRs().getString("idUser"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public ArrayList<UserModel> getUser() {
        return user;
    }

    public void setUser(ArrayList<UserModel> user) {
        this.user = user;
    }
    
    
}
