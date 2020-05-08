package com.company;

public class SıcaklıkKontrol implements IsıcaklıkKontrol {
    Sıcaklık sıcaklık=new Sıcaklık();

    @Override

    public int sıcaklıkOku() {
     return sıcaklık.getSıcaklık();
    }

    @Override
    public void sıcaklıkGonder(int gelenSıcaklık) {
       sıcaklık.setSıcaklık(gelenSıcaklık);
       System.out.println("Sıcaklık  "+gelenSıcaklık+"  şeklinde değiştirildi");
    }
}
