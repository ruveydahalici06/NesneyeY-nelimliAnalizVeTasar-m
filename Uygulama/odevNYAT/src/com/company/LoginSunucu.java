package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoginSunucu implements IKisiVeriTabanı{

    public boolean yetkiDurumu;

    public List<Kisi> kisiListele(String gelenAd, String gelenSifre) {

      List <Kisi> kisiler = new ArrayList<Kisi>();


      String sql= "SELECT *  FROM \"Uye\" WHERE \"kullaniciAdi\"="+"'"+gelenAd+"'"+ "AND \"sifre\"="+"'"+gelenSifre+"'"+ "AND \"yetki\"="+true;
       Baglantı conn=new Baglantı();
       conn.baglantı();
     try{
           Statement stmt = conn.baglantı().createStatement();
           ResultSet rs = stmt.executeQuery(sql);

           //***** Bağlantı sonlandırma *****
           conn.baglantı().close();

           int idkullanici;
           String kullaniciAdi;
           String sifre;
           boolean yetki;

           //bu while where koşulunda kalkacak
           while(rs.next()) {
               idkullanici = rs.getInt("IdKullanici");
               kullaniciAdi = rs.getString("kullaniciAdi");
               sifre = rs.getString("sifre");
               yetki = rs.getBoolean("yetki");

               kisiler.add(new Kisi(idkullanici, kullaniciAdi, sifre, yetki));
               yetkiDurumu=yetki;
           }

           rs.close();
           stmt.close();

       }
 catch (Exception e) {
     e.printStackTrace();
     kisiler=null;
     System.out.println("Sisteme yetkiniz bulunmamaktadır");
 }
        return kisiler;

  }

}

