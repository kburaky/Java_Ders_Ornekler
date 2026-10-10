package com.hafta2;

/**
 *
 * @author BURAK
 */
public class Dikdortgen {
    
    double en;
    double boy;

    public Dikdortgen() {
    }
    public Dikdortgen(double en) {
        this.en = en;
    }
    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }
    
    public void alanHesapla(){
        double alan = en * boy;
        System.out.println("ALAN HESABI: "+alan);
    }
    public void cevreHesapla(){
        double cevre = 2 * (en+boy);
        System.out.println("CEVRE HESABI: "+cevre);
    }
    public void kareAlanHesabi(){
        double kareAlan = en * en;
        System.out.println("KARE ALANI: "+kareAlan);
    }
    
    
}
