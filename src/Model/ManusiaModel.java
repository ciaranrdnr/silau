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
public class ManusiaModel {

    private String nik;
    private String nama;
    private String noHp;
    private Date tglLahir;
    private String alamat;

    private Database db;
    private ArrayList<ManusiaModel> manusia = new ArrayList<>();

    public ManusiaModel(String nik, String nama, String noHp, Date tglLahir, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.noHp = noHp;
        this.tglLahir = tglLahir;
        this.alamat = alamat;

        db = new Database();
    }

    public void loadManusia() {
        db.connect();
        try {
            String query = "SELECT * FROM manusia";
            db.setRs(db.getStmt().executeQuery(query));
            while (db.getRs().next()) {
                manusia.add(new ManusiaModel(db.getRs().getString("nik"), db.getRs().getString("nama"), db.getRs().getString("noHp"), db.getRs().getDate("tglLahir"), db.getRs().getString("alamat")));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
    }

    public ArrayList<ManusiaModel> getManusia() {
        return manusia;
    }

    //buat nambahin manusia
    public void addManusia(ManusiaModel m) {
        db.connect();
        String query = "INSERT INTO manusia VALUES (";
        query += "'" + m.getNik() + "',";
        query += "'" + m.getNama() + "',";
        query += "'" + m.getNoHp() + "',";
        query += "'" + m.getTglLahir() + "',";
        query += "'" + m.getAlamat() + "'";
        query += ")";
        System.out.println("QUERY = " + query);
        if (db.manipulate(query)) {
            manusia.add(m);
        }
        db.disconnect();
    }

    public boolean cekDuplikatNIK(String nik) {
        boolean cek = false;
        for (ManusiaModel mn : manusia) {
            if (mn.getNik().equals(nik)) {
                cek = true;
                break;
            }
        }
        return cek;
    }

    public void delManusia(String nik) {
        db.connect();
        String query = "DELETE FROM manusia WHERE nik='" + nik + "'";
        if (db.manipulate(query)) {
            for (ManusiaModel mn : manusia) {
                if (mn.getNik().equals(nik)) { //ngecek nik yang ada didatabase = yang mau dihapus
                    manusia.remove(mn);
                    break;
                }
            }
        }
        db.disconnect();
    }

    public void updateManusia(ManusiaModel m) {
        db.connect();
        String query = "UPDATE manusia SET";
        query += " nama ='" + m.getNama() + "',";
        query += " noHp ='" + m.getNoHp() + "',";
        query += " tglLahir='" + m.getTglLahir() + "'";
        query += " WHERE nik='" + m.getNik() + "'";
        if (db.manipulate(query)) {
            for (ManusiaModel mn : manusia) {
                if (mn.getNik().equals(m.getNik())) { //ngecek  yang ada didatabase = yang mau dihapus
                    mn.setNama(m.getNama());
                    mn.setNoHp(m.getNoHp());
                    mn.setTglLahir(m.getTglLahir());
                    mn.setAlamat(m.getAlamat());
                    break;
                }
            }
        }
        db.disconnect();
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String hoHp) {
        this.noHp = noHp;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
