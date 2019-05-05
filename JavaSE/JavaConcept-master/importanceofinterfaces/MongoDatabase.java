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
public class MongoDatabase implements IDatabase{
    //Methods for MongoDatabase which is implemeted IDatabase
     @Override
    public void add() {
        System.out.println("MongoDb add method is running");
    }

    @Override
    public void delete() {
        System.out.println("MongoDb delete method is running");
    }

    @Override
    public void get() {
        System.out.println("MongoDb get method is running");
    }

    @Override
    public void update() {
        System.out.println("MongoDb update method is running");
    }
}
