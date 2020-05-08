package com.company;

public class SogutucuAckapa implements ISogutucu {

    Sogutucu sogutucu=new Sogutucu();

    @Override
    public void sogutucuAc() {
      sogutucu.setDurum(true);
      System.out.println("Soğutu açıldı");
    }

    @Override
    public void sogutucuKapat() {
        sogutucu.setDurum(false);
        System.out.println("Soğutu kapatıldı");
    }
}
