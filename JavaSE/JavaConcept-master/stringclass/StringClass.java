/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

/**
 *
 * @author Orkhan
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //we created new string in the any part of memory
        //but s1 and s3 located same part of memory
        String s1 = "Hello world";
        String s3 = "Hello world";
        
        //we created new string in the any part of memory
        String s2 = new String("Java");
        
        //for see length of string
        System.out.println(s2.length());
        
        //for see 1. (or any index) index of string
        System.out.println("First index: " + s2.charAt(0));
        
        //for see last character of string(special function)
        System.out.println("Last index: " + s2.charAt(s2.length()-1));
        
        //if string start with (any character); we are testing with this method
        System.out.println(s2.startsWith("J")); //it's boolean method
        
        //if string ends with m (we are testing with this method)
        System.out.println(s2.endsWith("a")); //it's boolean method
        
        //you can see these strings are located same part of memory
        //or otherwise
        if(s1==s3){
            System.out.println("Located same part of memory");
        }else{
            System.out.println("Located different part of memory");
        }
        
        //are the values equal?
        if(s1.equals(s3)){
            System.out.println("The values are equal");
        }else{
            System.out.println("The values are not equal");
        }

    }
    
}
