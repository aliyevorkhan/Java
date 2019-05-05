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
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractDatabase abstractDatabase1 = new MysqlDatabase();
        AbstractDatabase abstractDatabase2 = new MongoDatabase();
        
        abstractDatabase1.add();
        abstractDatabase2.delete();
        
        abstractDatabase1.update();
        abstractDatabase2.get();
    }
    
}
