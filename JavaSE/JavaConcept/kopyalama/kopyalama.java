 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopyalama;

    class insan{
    int boy;
    }
    
    class ogrenci extends insan implements Cloneable{
      Object kopyala() throws CloneNotSupportedException{
      return this.clone();
      
      }  
      ogrenci kopyala2(){
          ogrenci temp = new ogrenci();
          temp.boy = this.boy;
          return temp;
      }
      
      boolean equals(ogrenci rhs){
      return this.boy == rhs.boy;
      } 
      @Override
      public String toString(){
          return "bu objenin boyu" + this.boy;
      }
      
    }

/**
 *
 * @author Orkhan
 */
public class kopyalama {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        insan ali = new insan();
        
        insan ahmet = ali; //shallow copy (sig kopyalama);
        ali.boy = 180;
        System.out.println(ahmet.boy);
        
        if(ali==ahmet){
        
            System.out.println("same");
        }
        if(ali.equals(ahmet)){
            System.out.println("same1");
        }
        
        ogrenci ayse = new ogrenci();
        ayse.boy = 160;
        ogrenci fatma = (ogrenci)ayse.kopyala2(); // deep copy;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy = 190;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        ayse.boy = 190;
        if(ayse==fatma){
            System.out.println("same2");
        }
        if(ayse.equals(fatma)){
            System.out.println("same3");
        }
        System.out.println(ayse);
        System.out.println(ayse.hashCode());
    }   
    
}
