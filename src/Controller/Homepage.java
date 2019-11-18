/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.dialogLogin;
import View.dialogcreate;
import View.viewHomepage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author ciara
 */
public class Homepage {

    viewHomepage view;

    public Homepage() {
        view = new viewHomepage();
        view.setVisible(true);
        initComponents();

    }

    private void initComponents() {
        view.addbDaftarC(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cDialogCreate();
            }

        });

        view.addbLoginC(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                new cDialogLogin(Homepage.this);
            }
        });

    }

}
