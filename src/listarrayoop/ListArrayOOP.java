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
public class ListArrayOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<ModelMusteri> musteriListe;
        ArrayList<ModelIslemler> islemlerListe;

        ModelMusteri musteri;
        ModelIslemler islemler;

        islemlerListe = new ArrayList<>();

// 1. Müşteri 1. İşlemi
        islemler = new ModelIslemler();
        islemler.setAd("Alış");
        islemler.setTutar(1500);
        islemlerListe.add(islemler);
// 1. Müşteri 2. İşlemi
        islemler = new ModelIslemler();
        islemler.setAd("Satış");
        islemler.setTutar(400);
        islemlerListe.add(islemler);
// 1. Müşteri Listeye kayıt
        musteriListe = new ArrayList<>();
        musteri = new ModelMusteri();
        musteri.setId(1);
        musteri.setAd("veysel");
        musteri.setSoyad("tarçın");
        musteri.setIslem(islemlerListe);
        musteriListe.add(musteri);

        //------------------------------------------------
        islemlerListe = new ArrayList<>();
// 2. Müşteri 1. İşlemi
        islemler = new ModelIslemler();
        islemler.setAd("Alış");
        islemler.setTutar(200);
        islemlerListe.add(islemler);
// 2. Müşteri 1. İşlemi
        islemler = new ModelIslemler();
        islemler.setAd("Satış");
        islemler.setTutar(950);
        islemlerListe.add(islemler);
// 2. Müşteri Listeye kayıt

        musteri = new ModelMusteri();
        musteri.setId(2);
        musteri.setAd("yüksel");
        musteri.setSoyad("doğan");
        musteri.setIslem(islemlerListe);
        musteriListe.add(musteri);

        System.out.println("\n ******************************************************* \n");
        int eksi = 0, arti = 0;
        for (ModelMusteri item : musteriListe) {
            System.out.println("Muşteri id = " + item.getId());
            System.out.println("Muşteri Adı = " + item.getAd());
            System.out.println("Muşteri Soyadı = " + item.getSoyad());
                System.out.println("---------------------------------------");
            for (ModelIslemler islemleritem : item.getIslem()) {
                System.out.print("İşlem = " + islemleritem.getAd() + "    ");
                System.out.println("İşlem Tutarı= " + islemleritem.getTutar());
                if (islemleritem.getAd().equals("Alış")) {
                    eksi = islemleritem.getTutar();

                } else if (islemleritem.getAd().equals("Satış")) {
                    arti = islemleritem.getTutar();
                }
            }
            System.out.println("---------------------------------------");
            System.out.println("Toplam Sonuç : " + (arti - eksi));
            System.out.println("\n ******************************************************* \n");
        }

    }

}
