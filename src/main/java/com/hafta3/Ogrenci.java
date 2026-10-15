package com.hafta3;

/**
 *
 * @author BURAK
 */
public class Ogrenci {
   
    private String ad;
    private int yas;

    public Ogrenci() {
    }

    public Ogrenci(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        
        if(yas>=0 && yas<=120){
           this.yas = yas; 
        }else{
            System.out.println("Gecersiz yas"); 
        }
        
    }

    
    
    
    
    
    
    
    
}
