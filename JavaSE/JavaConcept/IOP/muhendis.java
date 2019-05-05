/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOP;

/**
 *
 * @author Orkhan
 */
public class muhendis extends insan{
    int maas;
    public muhendis(){ //constructor
        this(150);
    }
    public muhendis(int maas){ //constructor
        if(maas>0){
            this.maas = maas;
        }else{                  // maas 0 veya eksi deger girilmesin diye
            this.maas = 7000;
        }
    }
    public muhendis(int maas, int boy, int kilo){
        super(boy,kilo);
    }
    int zam(){
        maas++;
        return maas;
    }
    //overloading
    int zam(int zamMiktari){
        maas += zamMiktari;
        return maas;
    }
    int zam(float zamOrani){
        float artis = zamOrani * maas;
        this.zam((int)artis);
        return maas;
    }
    @Override
    void yemek(){
        kilo = kilo + 2;
    }
    void yemek(int kilo){
        this.kilo += kilo;
    }
}
