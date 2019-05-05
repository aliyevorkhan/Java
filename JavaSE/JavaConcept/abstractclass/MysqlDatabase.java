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
public class MysqlDatabase extends AbstractDatabase {

    @Override
    void update() {
        System.out.println("Mysql has been updated.");
    }

    @Override
    void get() {
        System.out.println("Mysql has been got data.");
    }
    
}
