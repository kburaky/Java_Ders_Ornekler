package com.hafta3;

/**
 *
 * @author BURAK
 */
public class Main {
    public static void main(String[] args) {
        
        Ogrenci o1 = new Ogrenci("Ahmet", 25);
        
        System.out.println("getAd degeri: "+o1.getAd());
        System.out.println("getYas degeri: "+o1.getYas());
                
        o1.setYas(119);
        
        System.out.println("yeni getYas degeri: "+o1.getYas());
        
        
    }
    
    
    
    
}
