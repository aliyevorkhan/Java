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
public class insan {
    int boy;
    int kilo;
    public insan(){
        
    }
    public insan(int boy, int kilo){
        if(boy > 0 && kilo > 0){
        this.boy = boy;
        this.kilo = kilo;
        }
        System.out.println("yeni insan olustu");
    }
    void yemek(){
        kilo++;
    }
}
