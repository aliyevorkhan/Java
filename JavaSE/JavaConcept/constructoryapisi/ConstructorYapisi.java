/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoryapisi;
class insan{
    int boy;
    int kilo;
    int yas;
    public insan(){ // class ile ayni isme sahip ve return type yoktur;
        System.out.println("bir insan objesi olusturuldu"); 
        kilo = 75;
    }
    public insan(int yas, int kilo, int boy){ //Polymorphism
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
    }
}
/**
 *
 * @author Orkhan
 */
public class ConstructorYapisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insan veli = new insan(20,60,150);
        insan ali = new insan(); // default constructor
        ali.boy = 180;
        //ali.kilo = 70;
        System.out.println("Ali'nin boyu :" +ali.boy 
                + "\nAli'nin kilosu: " + ali.kilo);
         System.out.println("Veli'nin boyu :" +veli.boy 
                + "\nVeli'nin kilosu: " + veli.kilo);
    
    }
    
}
