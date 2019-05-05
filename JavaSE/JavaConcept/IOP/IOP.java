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
public class IOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insan ali = new insan();
        muhendis veli = new muhendis(2000,185,99);
        //veli.boy = 190;
        System.out.println("velinin boyu: " + veli.boy);
        //veli.kilo = 90;
        veli.yemek(95);
        System.out.println("velinin yemek yedikden sonraki kilosu: " + veli.kilo);
        veli.maas = 100;
        veli.zam((float)0.5);
        System.out.println("velinin zamli maasi;" + veli.maas);
    }
    
}
