package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        Scanner sc=new Scanner(System.in);

        List<Kisi> listeLog = new ArrayList<Kisi>();

        String gelenAd;
        String gelenSifre;
        System.out.println("Giriş yapmak için kullanıcı adı ve şifrenizi giriniz !");
        System.out.println("Kullanici Adi : ");
        System.out.println("Sifre : "); gelenAd=sc.next();
        LoginSunucu log= new LoginSunucu();gelenSifre=sc.next();
        listeLog = log.kisiListele(gelenAd,gelenSifre);
        System.out.println(listeLog);

        /************************* yetki var ise**********************************/

        if(log.yetkiDurumu==true){
            while(true){
                int cevap;
                System.out.println("Soğutucu için 1");
                System.out.println("Sıcaklık için 2");
                System.out.println("Çıkış için 3");
                System.out.println("Menüden seçiminizi yapınız");cevap=sc.nextInt();

                switch (cevap){
                    case 1:
                        SogutucuAckapa sogutucu=new SogutucuAckapa();
                        System.out.println("Soğutucuyu aç 1");
                        System.out.println("Soğutucu kapat 2");
                        System.out.println("Çıkış için 3");
                        System.out.println("Menüden seçiminizi yapınız");cevap=sc.nextInt();

                        switch (cevap){
                            case 1:
                                sogutucu.sogutucuAc();
                                break;
                            case 2:
                                sogutucu.sogutucuKapat();
                                break;

                        }
                    default:
                        break;
                    case 2:
                        SıcaklıkKontrol sıcaklık=new SıcaklıkKontrol();
                        String answer;
                        int istenilenSıcaklık;
                        System.out.println("Şu an ki sıcaklık değeri  "+ sıcaklık.sıcaklıkOku());
                        System.out.println("Sıcaklığı Değiştirmek istiyor musunuz? E/H");answer=sc.next();
                        switch (answer){
                            case "E":
                                System.out.println("İstedğiniz sıcaklık değerini giriniz");istenilenSıcaklık=sc.nextInt();
                                sıcaklık.sıcaklıkGonder(istenilenSıcaklık);
                                break;
                            case"H":
                                break;
                            default:
                                break;
                        }

                        break;
                }
                if(cevap==3){
                    System.out.println("Sistemden çıkılıyor");
                    break;
                }
                System.out.println();
            }

        }
        else
            System.out.println("Yetki durumunuz sınırlı.Bu yüzden erişiminiz yok.");
    }
}
