package com.company;

import java.util.List;

public class Kisi {

      private int idKullanici=0;
      private String kullamiciAdi=null;
      private String sifreGirilen=null;
      private boolean yetkiVarMı=false;

    public Kisi( int IdKullanici,String kullaniciAdi, String sifre,boolean yetki) {
        this.idKullanici=IdKullanici;
        this.kullamiciAdi = kullaniciAdi;
        this.sifreGirilen = sifre;
        this.yetkiVarMı = yetki;
    }

    public int getIdKullanici() {
        return idKullanici;
    }

    public String getKullamiciAdi() {
        return kullamiciAdi;
    }

    public String getSifre() {
        return sifreGirilen;
    }

    public boolean getyetki() {
        return yetkiVarMı;
    }
    public void setKullaniciAdi(String kullaniciAdi){
        this.kullamiciAdi=kullaniciAdi;
     }
    public void setSifre(String sifre){
        this.sifreGirilen=sifre;
    }

    @Override
    public String toString() {
        return "Hoşgeldiniz  "+kullamiciAdi;
    }

}
