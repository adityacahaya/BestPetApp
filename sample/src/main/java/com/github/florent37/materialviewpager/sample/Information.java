package com.github.florent37.materialviewpager.sample;

/**
 * Created by I Kadek Aditya on 5/6/2017.
 */

import java.io.Serializable;

/**
 * membuat class information untuk menampung data tempat wisata
 * Serializable untuk pass data dari fragment ke activity baru
 */

public class Information implements Serializable {

    private String namaTempat;
    private int gambarTempat;
    private String deskripsiTempat;
    private int backgroundWarna;
    private int gambarDeskripsi;

    public Information(int gambarDeskripsi, String namaTempat, int gambarTempat, String deskripsiTempat, int backgroundWarna){
        this.namaTempat = namaTempat;
        this.gambarTempat = gambarTempat;
        this.deskripsiTempat = deskripsiTempat;
        this.backgroundWarna = backgroundWarna;
        this.gambarDeskripsi = gambarDeskripsi;
    }

    public String getNamaTempat(){
        return this.namaTempat;
    }

    public int getGambarTempat(){
        return this.gambarTempat;
    }

    public String getDeskripsiTempat(){
        return this.deskripsiTempat;
    }

    public int getBackgroundWarna(){ return this.backgroundWarna; }

    public int getGambarDeskripsi() {
        return this.gambarDeskripsi;
    }
}
