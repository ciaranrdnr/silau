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
public class SearchModel extends UserModel{
    private String idSearch;
    private String idUser;
    private String idLagu;

    private Database db;
    private ArrayList<SearchModel> cari = new ArrayList<>();
    private UserModel user = new UserModel();
    private LaguModel lagu = new LaguModel();
    
    public SearchModel(String idSearch, String idUser, String idLagu) {
        this.idSearch = idSearch;
        this.idUser = idUser;
        this.idLagu = idLagu;
        db = new Database();
    }

    public void loadSearch(){
        db.connect();
        try {
            String query = "SELECT * FROM search";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
                cari.add(new SearchModel(db.getRs().getString("idSearch"), db.getRs().getString("idUser"), db.getRs().getString("idLagu")));   
            }
        }catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }
    
    public void addDetail(SearchModel sr) {
        db.connect();
        String query = "INSERT INTO search VALUES (";
        query += "'" + sr.getIdSearch()+ "',";
        query += "'" + sr.getIdUser()+ "',";
        query += "'" + sr.getIdLagu()+ "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            cari.add(sr);
        }
        db.disconnect();
    }
    
    public SearchModel findViewById(String id){
        db.connect();
        try {
           String query = "SELECT * FROM user where idUser = '"+id+"'";
           db.setRs(db.getStmt().executeQuery(query));
           while (db.getRs().next()){
            return (SearchModel) new UserModel(db.getRs().getString("idUser"), db.getRs().getString("nama"), db.getRs().getDate("tglLahir"), db.getRs().getString("username"), db.getRs().getString("email"), db.getRs().getString("password"));
           }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        return null;
    }
    
       
    public String getIdSearch() {
        return idSearch;
    }

    public void setIdSearch(String idSearch) {
        this.idSearch = idSearch;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public ArrayList<SearchModel> getCari() {
        return cari;
    }

    public void setCari(ArrayList<SearchModel> cari) {
        this.cari = cari;
    }


    public void setUser(UserModel user) {
        this.user = user;
    }

    public LaguModel getLagu() {
        return lagu;
    }

    public void setLagu(LaguModel lagu) {
        this.lagu = lagu;
    }
    
    
}
