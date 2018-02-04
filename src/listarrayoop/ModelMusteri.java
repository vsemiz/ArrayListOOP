/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarrayoop;

import java.util.ArrayList;

/**
 *
 * @author sd
 */
public class ModelMusteri {

    private int id;
    private String ad;
    private String soyad;
    private ArrayList<ModelIslemler> islem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public ArrayList<ModelIslemler> getIslem() {
        return islem;
    }

    public void setIslem(ArrayList<ModelIslemler> islem) {
        this.islem = islem;
    }


}
