/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneFelsefesi;

import java.util.Scanner;

/**
 *
 * @author Orkhan
 */
public class nesneFelsefesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calisan ali = new calisan();
        
        insan veli = new insan();
        veli.boy = 180; //cm
        veli.kilo = 1; //kg
        veli.yas = 22; //year
        System.out.println("1 kilo: " + veli.kilo);
        
        float boyKaresi, kitleEndeksi;
        boyKaresi = veli.boy * veli.boy;
        kitleEndeksi = veli.kilo / boyKaresi;
        kitleEndeksi = kitleEndeksi * 10000;
        if (kitleEndeksi >= 0 && kitleEndeksi <= 18.5 )
        {
            System.out.println("Zayif");
        }
        else if (kitleEndeksi >= 18.6 && kitleEndeksi <= 24.9)
        {
            System.out.println("Normal");
        }
        else if(kitleEndeksi >= 25 && kitleEndeksi <= 29.9)
        {
            System.out.println("Kilolu");
        }
        else 
        {
            System.out.println("Asiri kilolu");
            
        }
        ali.gelir = 100;
        ali.zam(20);
        System.out.println("Velinin zamlanmis maasi: " + ali.gelir);    
   
    }
        
}
