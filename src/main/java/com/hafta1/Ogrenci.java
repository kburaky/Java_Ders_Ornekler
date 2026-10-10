package com.hafta1;

/**
 *
 * @author BURAK
 */
public class Ogrenci {
    
    String ad;
    String bolum;
    int numara;

    public Ogrenci() {
    }
    
    public Ogrenci(String ad, String bolum, int numara) {
        this.ad = ad;
        this.bolum = bolum;
        this.numara = numara;
    }

    
    
    public void bilgiYazdir(){
        System.out.println(ad+"-"+numara+"-"+bolum);
    }
    
    
    
    
}
