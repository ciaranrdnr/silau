/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.searchUser;
import Model.AlbumModel;
import Model.LaguModel;
import Model.UserModel;
import Model.penyanyiModel;
import Model.LirikModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author ciara
 */
public class cUserSearch {
    searchUser view;
//    private List<penyanyiModel> resultSearchPenyanyi = new ArrayList<>();
//    private List<AlbumModel> resultSearchAlbum = new ArrayList<>();
//    private List<LirikModel> resultSearchLirik = new ArrayList<>();
//    private List<UserModel> resultSearchUser = new ArrayList<>();
//    private List<LaguModel> resultSearchLagu = new ArrayList<>();
    

    public cUserSearch() {
        view = new searchUser();
        view.setVisible(true);
        initComponents();
    }
    
    private void initComponents() {
//        view.settfSearchListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent de) {
//                   doSearch(view.getSearch());
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent de) {
//                doSearch(view.getSearch());
//            }
//            
//            
//            @Override
//            public void changedUpdate(DocumentEvent de) {
//                
//            }
//        });
        
        view.addSearchListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
             if(ke.getKeyCode() == KeyEvent.VK_ENTER){
                 System.out.println("enter");
                 new cUserSearchRes(view.getSearch());
                 
             }   
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
    }
    
    }
    
    
//}
