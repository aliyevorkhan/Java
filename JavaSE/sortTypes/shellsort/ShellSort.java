/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsort;

import java.util.Arrays;

/**
 *
 * @author Orkhan
 */
public class ShellSort {
    public static void sort(int[] array) {
    int inner, outer;
    int temp;
 
    int h = 1;
    while (h <= array.length / 3) {
      h = h * 3 + 1;
    }
    while (h > 0) {
      for (outer = h; outer < array.length; outer++) {
        temp = array[outer];
        inner = outer;
 
        while (inner > h - 1 && array[inner - h] >= temp) {
          array[inner] = array[inner - h];
          inner -= h;
        }
        array[inner] = temp;
      }
      h = (h - 1) / 3;
    }
  }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] array = {5,3,0,2,4,1,0,5,2,3,1,4}; 
    System.out.println("Before: " + Arrays.toString(array));
    sort(array);
    System.out.println("After:  " + Arrays.toString(array));    }
    
}
