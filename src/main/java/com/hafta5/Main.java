package com.hafta5;

/**
 *
 * @author BURAK
 */
public class Main {
    public static void main(String[] args) {
        
        Araba a1 = new Araba("Toyota", 180, 5);
        
        a1.bilgileriGoster();
        
        System.out.println(a1.getMarka()+"-"+a1.getHiz()+"-"+a1.getKapiSayisi());
    }
}
