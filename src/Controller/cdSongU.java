/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LirikModel;
import View.dArtistU;
import View.dSongU;

/**
 *
 * @author ciara
 */
public class cdSongU {
    dSongU view;
    public LirikModel lirik;

    public cdSongU(String m) {
        view = new dSongU();
        lirik = new LirikModel();
        view.setVisible(true);
        initComponents();
        loadLirik(m);
        
//        view.setTfLirik(m);
        
    }

    public void loadLirik(String id) {
        lirik = lirik.findViewById(id);
        view.setTfLirik(lirik.getDetailLirik());
    }
    
    private void initComponents() {
        
    }
}
