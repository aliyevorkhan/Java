/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Orkhan
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    //mean method has created
    public static void mean(int[] arr){
        //gave initial value
        int total = 0;
        
        //output of method of mean
        for(int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }
        System.out.println("Average: " + total/arr.length);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //created new array
        int[] arr2 = new int[5];
       
        System.out.println("Please enter the number for array2");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = input.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Elements of arr2: " + "{"+ arr2[i] + "}");
        }
        
        //call method of mean
        mean(arr2);
    }
}
