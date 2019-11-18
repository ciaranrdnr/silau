/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserModel;
import Model.AdminModel;
import View.adminAddAlbum;
import View.dialogLogin;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ciara
 */
public class cDialogLogin {
    dialogLogin view;
    UserModel model;
    AdminModel admin;
    ResultSet rs;

    public cDialogLogin(Homepage lastController) {
        view = new dialogLogin();
        //model = new SilauBos();
        
        view.setVisible(true);
        initComponents();
    }

    private void initComponents() {
        view.addbLogUserLAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
                onClickLogin();
            }
        });
                
        view.addlogAdminLAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onClickAdLogin();
// new adminHome(); //To change body of generated methods, choose Tools | Templates.
            }
              
        }
      );
        
    }
    public void onClickLogin() {
        if (isLoginValid()) {
            System.out.println("valid");
            UserModel user = new UserModel();
            user = user.doLogin(view.getTfUSername(), view.getTfPass());
            if (user == null){
                JOptionPane.showMessageDialog(null, "Gagal Login");
            }else{
                new cUserSearch();
                view.dispose();
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Login");
        }
    }
    
    public Boolean isLoginValid() {
        boolean isValid = true;
        if (view.getTfUSername().equals("") || view.getTfUSername().equals("Username")) {
            return false;
        }
        if (view.getTfPass().equals("") || view.getTfPass().equals("Password")) {
            return false;
        }
        return isValid;
        
    }
    
    public void onClickAdLogin() {
        if (isLoginValid()) {
            System.out.println("valid");
            AdminModel admin = new AdminModel();
            admin = admin.doLogin(view.getTfUSername(), view.getTfPass());
            if (admin == null){
                JOptionPane.showMessageDialog(null, "Gagal Login");
            }else{
                new cAdminHome();
                view.dispose();
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Login");
        }
    }
    
    public Boolean isLoginAdValid() {
        boolean isValid = true;
        if (view.getTfUSername().equals("") || view.getTfUSername().equals("Username")) {
            return false;
        }
        if (view.getTfPass().equals("") || view.getTfPass().equals("Password")) {
            return false;
        }
        return isValid;
        
    }
    
    
    
}
