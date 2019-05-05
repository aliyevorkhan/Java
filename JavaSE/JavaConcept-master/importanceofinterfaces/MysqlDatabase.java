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
public class MysqlDatabase implements IDatabase{

    //Methods for MysqlDatabse which is implemeted IDatabase
    @Override
    public void add() {
        System.out.println("Mysql add method is running");
    }

    @Override
    public void delete() {
        System.out.println("Mysql delete method is running");
    }

    @Override
    public void get() {
        System.out.println("Mysql get method is running");
    }

    @Override
    public void update() {
        System.out.println("Mysql update method is running");
    }
    
}
