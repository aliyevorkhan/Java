/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

import java.util.ArrayList;

/**
 *
 * @author Orkhan
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<String>();
        //created for FOREACH loop
        int[] arr = {1,2,3,4,5};

        groups.add("Blue");
        groups.add("Red");
        groups.add("Green");
        groups.add("Black");
        
        //if you want to remove any element from list with String
        //groups.remove("Black");
        
        //if you want to remove any element from list with index
        //groups.remove(4);
        
        
        //elements of group have written manually
        System.out.println("Index of 0: " + groups.get(0));
        System.out.println("Index of 1: " + groups.get(1));
        System.out.println("Index of 2: " + groups.get(2));
        
        
        //if you want to see index of element of group
        System.out.println("Index of element: " + groups.indexOf("Blue"));
        
        //if you want to know what is the size of the list
        System.out.println("Legth of Arraylist: " + groups.size());
        
        //if you want to see elements of group on the screen
        //have written with FOR LOOP
        for(int i = 0; i < groups.size(); i++){
            System.out.println("Elements(with for): " + groups.get(i));
        }

        //FOR EACH loop
        for(String s: groups){
            System.out.println("Elements(with foreach): " + s);
        }

        // int array example
        for(int i: groups){
            System.out.println("Elements with foreach: " + i);
        }
    }
    
}
