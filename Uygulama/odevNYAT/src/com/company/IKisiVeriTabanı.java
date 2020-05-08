package com.company;

import java.sql.Connection;
import java.util.List;

public interface IKisiVeriTabanı {
    
    public boolean yetkiDurumu = false;
    public  List<Kisi> kisiListele(String gelenAd, String gelenSifre);
}
