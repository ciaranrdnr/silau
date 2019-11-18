/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AlbumModel;
import Model.LaguModel;
import Model.LirikModel;
import Model.UserModel;
import Model.penyanyiModel;
import View.searchUserResult;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ciara
 */
public class cUserSearchRes {

    searchUserResult view;
    String key;
    String jey;
    String mey;
    public List<penyanyiModel> resultSearchPenyanyi = new ArrayList<>();
    public List<AlbumModel> resultSearchAlbum = new ArrayList<>();
    public List<LirikModel> resultSearchLirik = new ArrayList<>();
    public List<UserModel> resultSearchUser = new ArrayList<>();
    public List<LaguModel> resultSearchLagu = new ArrayList<>();

    public cUserSearchRes(String e) {
        view = new searchUserResult();
        view.setVisible(true);
        initComponents();
        doSearch(e);
    }

    private void initComponents() {
        view.addlSong2(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                   new cdSongU(resultSearchLagu.get(0).getIdLagu());
            }
            
        });
        view.addlSong1(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                   new cdSongU(resultSearchLagu.get(1).getIdLagu());
            }
        
        });
        view.addlArtist1(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
                //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        view.addlArtist2(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        view.addlWord1(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                 new cdSongU(resultSearchLirik.get(0).getIdLirik());
            }
        
        });
        view.addlWord2(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                  new cdSongU(resultSearchLirik.get(1).getIdLirik());
            }
        
        });
        
        view.addSmoreSong(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

        });
        view.addSmoreWord(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

        });
        view.addSmoreArt(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        });

    }
    
    public void doSearch(String query) {
        
        resultSearchAlbum = new AlbumModel().findViewByNama(query);
        resultSearchPenyanyi = new penyanyiModel().findViewByNama(query);
        resultSearchLirik = new LirikModel().findViewByLirik(query);
        resultSearchUser = new UserModel().findViewByNama(query);
        resultSearchLagu = new LaguModel().findViewByJudul(query);
        if (resultSearchLagu.size() > 0) {
            view.setlSong2(resultSearchLagu.get(0).getJudul());
//            jey = resultSearchLirik.get(0).getDetailLirik();
            if (resultSearchLagu.size() > 1) {
//                mey = resultSearchLirik.get(1).getDetailLirik();
                view.setlSong1(resultSearchLagu.get(1).getJudul());
            }
        }

        if (resultSearchPenyanyi.size() > 0) {
            view.setlArtist1(resultSearchPenyanyi.get(0).getNama());
            
            if (resultSearchPenyanyi.size() > 1) {
                view.setlSong2(resultSearchPenyanyi.get(1).getNama());
                
            }
        }
        
        if (resultSearchLirik.size() > 0) {
            view.setlWord1(resultSearchLirik.get(0).getLagu().getJudul());
            view.setlWordart3(resultSearchLirik.get(0).getDetailLirik());
//            key = resultSearchLirik.get(0).getDetailLirik(); // buat kirim ke cdSongU
            
            if (resultSearchLirik.size() > 1) {
                view.setlWord2(resultSearchLirik.get(1).getLagu().getJudul());
                view.setlWordart4(resultSearchLirik.get(1).getDetailLirik());
            }
        }
        
        
        System.out.println("result album  :" + resultSearchAlbum.size());
        System.out.println("result penyanyi  :" + resultSearchPenyanyi.size());
        System.out.println("result lirik  :" + resultSearchLirik.size());
        System.out.println("result user  :" + resultSearchUser.size());
        System.out.println("result lagu  :" + resultSearchLagu.size());
    }
}
