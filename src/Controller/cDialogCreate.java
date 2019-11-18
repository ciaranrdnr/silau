/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserModel;
import View.dialogcreate;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;
import javax.jws.soap.SOAPBinding;
import javax.swing.JOptionPane;

/**
 *
 * @author ciara
 */
public class cDialogCreate {

    dialogcreate view;
    UserModel model;

    public cDialogCreate() {
        view = new dialogcreate();
        model = new UserModel();
        view.setVisible(true);
        
        initComponents();
    }

    public void onClickRegister() {

        if (isRegisterValid()) {
            System.out.println("valid");
            view.dispose();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal mendaftar");
        }
    }

    public Boolean isRegisterValid() {
        
        boolean isValid = view.getcb();
        
        if (view.getTfEmail().equals("") || view.getTfEmail().equals("Email")| isEmailValid()) {
            return false;
        }
        if (view.getTfNama().equals("") || view.getTfNama().equals("Name")) {
            return false;
        }
        if (view.getTfUsername().equals("") || view.getTfUsername().equals("Username")) {
            return false;
        }
        if (view.getTfPass().equals("") || view.getTfPass().equals("Password")) {
            return false;
        }
        
        model.addUser(new UserModel(view.getTfNIK(),view.getTfNama(),view.getTfBirthday(), view.getTfUsername(), view.getTfEmail(), view.getTfPass()));
        
        return isValid;
    }
    public boolean isEmailValid(){
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", view.getTfEmail())))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The email is valid", "Good!", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    public void initComponents() {
        view.addBSignupAdapter(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                onClickRegister(); //To change body of generated methods, choose Tools | Templates.
                System.out.println(isRegisterValid());
            }

        });
    }

}
