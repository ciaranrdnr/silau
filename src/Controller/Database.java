package Controller;

import Model.AdminModel;
import Model.ManusiaModel;
import Model.AlbumModel;
import Model.LaguModel;
import Model.LirikModel;
import Model.UserModel;
import Model.penyanyiModel;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win 10
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<AlbumModel> album = new ArrayList<>();

    
    // 1. selalu mulai dengan connect dulu, baru insert into blablabla
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/silau";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            
            DatabaseMetaData dmd = conn.getMetaData(); //fungsi: ngecek metadata. metadata itu inforasi tentang koneksi yang terhubung
            System.out.println("URL : "+dmd.getURL());
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // 2. baru disconnect. 
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //4. manipulate: untuk memanipulasi data kaya insert, update, delete
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }

    public Statement getStmt() {
        return stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public ArrayList<AlbumModel> getAlbum() {
        return album;
    }
   
    
}
