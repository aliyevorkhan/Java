/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakeatm;

import java.util.Scanner;

/**
 *
 * @author Orkhan
 */
public class FakeATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;
        int islem;
        int para;
    
        while(true){
        System.out.println("[1] Bakiye Goruntule");
        System.out.println("[2] Hesaptan Para Cek");
        System.out.println("[3] Hesaba Para Yatir");
        System.out.println("[4] Sistemden Cikis");
        
        islem = input.nextInt();
        
        if(islem==1){
            System.out.println("Bakiyeniz " + bakiye +" tl'dir");          
        }else if(islem==2){
            System.out.println("Hesaptan ne kadar "
                        + "para cekmek istiyorsunuz?");
                para = input.nextInt();
                if(para > bakiye){
                    System.out.println("Hesabinizda " + para 
                            + " tl mevcut degil!");
                }
                else{
                    bakiye = bakiye - para;
                    System.out.println("Hesabinizdan " + para
                            + " tl basarili bir sekilde cekilmistir");
                    System.out.println("Guncel Bakiyeniz " + bakiye + " tl'dir");
                }
        }else if(islem==3){
            System.out.println("Hesaba ne kadar "
                        + "para yatirmak istiyorsunuz?");
                para = input.nextInt();
                bakiye = bakiye + para;
                System.out.println("Hesabiniza " + para
                            + " tl basarili bir sekilde yatirilmistir");
                System.out.println("Guncel Bakiyeniz " + bakiye + " tl'dir");
        }else if(islem==4){
            System.out.println("Sistemden Guvenli bir sekilde Cikis yaptiniz");
                break;
        }else{
            System.out.println("Gecersiz Islem");
                break;
        }
        /*switch(islem){
            case 1:
                System.out.println("Bakiyeniz " + bakiye +" tl'dir");
                break;
            case 2:
                System.out.println("Hesaptan ne kadar "
                        + "para cekmek istiyorsunuz?");
                para = input.nextInt();
                if(para > bakiye){
                    System.out.println("Hesabinizda " + para 
                            + " tl mevcut degil!");
                }
                else{
                    bakiye = bakiye - para;
                    System.out.println("Hesabinizdan " + para
                            + " tl basarili bir sekilde cekilmistir");
                    System.out.println("Guncel Bakiyeniz " + bakiye + " tl'dir");
                }
                break;
            case 3:
                System.out.println("Hesaba ne kadar "
                        + "para yatirmak istiyorsunuz?");
                para = input.nextInt();
                bakiye = bakiye + para;
                System.out.println("Hesabiniza " + para
                            + " tl basarili bir sekilde yatirilmistir");
                System.out.println("Guncel Bakiyeniz " + bakiye + " tl'dir");
                break;
                
            case 4:
                System.out.println("Sistemden Guvenli bir sekilde Cikis yaptiniz");
                break;
            default :
                System.out.println("Gecersiz Islem");
                break;
                */
            }
   
        }
                
        
    }
    

