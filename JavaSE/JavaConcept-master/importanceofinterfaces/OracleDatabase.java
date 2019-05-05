 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importanceofinterfaces;

/**
 *
 * @author Orkhan
 */
public class OracleDatabase implements IDatabase {
    //Our company wants to add new database and work with that
    //so we created this class and write these lines
    //finally we call this class from main.java
     @Override
    public void add() {
        System.out.println("Oracle add method is running");
    }

    @Override
    public void delete() {
        System.out.println("Oracle delete method is running");
    }

    @Override
    public void get() {
        System.out.println("Oracle get method is running");
    }

    @Override
    public void update() {
        System.out.println("Oracle update method is running");
    }
}
