/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalArr;

import java.util.Scanner;

/**
 *
 * @author Orkhan
 */
public class multidimensionalArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //created array and give values 2x3
        int[][] arr = {{1,2,3},{4,5,6}};
        
        //give order for output of array manually
        System.out.println("a00: " + arr[0][0]);
        System.out.println("a11: " + arr[0][1]);
        System.out.println("a00: " + arr[0][2]);
        System.out.println("a00: " + arr[1][0]);
        System.out.println("a00: " + arr[1][1]);
        System.out.println("a00: " + arr[1][2]);
        
        //created second array 2x2
        int[][] arr2 = new int[2][2];
        
        //give values manually
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[1][0] = 3;
        arr2[1][1] = 4;

        //give order for output of the array automatically
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("Element:" + arr2[i][j]);
            }
        }
    }
    
}
