
package com.hafta2;

/**
 *
 * @author BURAK
 */
public class AnaSinifimiz {
    
    public static void main(String[] args) {
        
        Dikdortgen d1 = new Dikdortgen();
        d1.en  = 4.0;
        d1.boy = 8.0;
        Dikdortgen d2 = new Dikdortgen(6.0);
        Dikdortgen d3 = new Dikdortgen(5.0,3.0);
        
        System.out.println("D1 nesne degeri:");
        d1.alanHesapla();
        d1.cevreHesapla();
        System.out.println("D2 nesne degeri:");
        d2.kareAlanHesabi();
        System.out.println("D3 nesne degeri:");
        d3.alanHesapla();
        d3.cevreHesapla();
        
        System.out.println("D1 ve D3 nesne haberlesme: "+(d3.en*d1.boy));
        
    }
    
}
