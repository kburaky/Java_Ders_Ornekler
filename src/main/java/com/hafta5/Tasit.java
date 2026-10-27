package com.hafta5;

/**
 *
 * @author BURAK
 */
public class Tasit {
    
    private String marka;
    private int hiz;

    public Tasit(String marka, int hiz) {
        this.marka = marka;
        this.hiz = hiz;
    }

    public String getMarka() {
        return marka;
    }

    public int getHiz() {
        return hiz;
    }
    
    public void bilgileriGoster(){
        System.out.println(marka+" - "+hiz);
    }
    
    
    
    
    
}
