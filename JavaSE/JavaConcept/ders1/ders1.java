/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders1;

import java.util.Scanner;

/**
 *
 * @author Orkhan
 */
public class ders1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String keyLogin = "admin";
        String keyPass = "admin";
        
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kullanici adini giriniz: ");
        String valueLogin = input.nextLine();
        System.out.println("lutfen sifreyi giriniz: ");
        String valuePass = input.nextLine();
        
        if((keyLogin.equals(valueLogin)) && (keyPass.equals(valuePass))){
            System.out.println("giris basarili");
        }else if((keyLogin.equals(valueLogin)) && !(keyPass.equals(valuePass))){
            System.out.println("sifreyi yanlis girdiniz!");
        }else if(!(keyLogin.equals(valueLogin)) && (keyPass.equals(valuePass))){
            System.out.println("kullanici adini yanlis girdiniz!");
        }else if(!(keyLogin.equals(valueLogin)) && !(keyPass.equals(valuePass))){
            System.out.println("kullanici adi ve sifre yanlis");
        }
    
    
    }
    
}
