package com.company;

import java.util.Random;

public class Sıcaklık {
    private int sıcaklık;

    public Sıcaklık(){

        Random r=new Random(); //random sınıfı
        this.sıcaklık=r.nextInt(55); // 55 e kadar sayı üretebilir.
    }

    public int getSıcaklık(){return sıcaklık;}

    public void setSıcaklık(int sıcaklık) {
        this.sıcaklık = sıcaklık;
    }
}
