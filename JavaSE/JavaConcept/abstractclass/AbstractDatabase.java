/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Orkhan
 */
public abstract class AbstractDatabase {
    public void add(){
        System.out.println("Added...");
    }
    public void delete(){
        System.out.println("Deleted...");
    }
    abstract void update();
    abstract void get();
}
