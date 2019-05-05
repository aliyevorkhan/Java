/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

/**
 *
 * @author Orkhan
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    
    public void study(){
        System.out.println(this.name + " is studying...");
    }
    
}
