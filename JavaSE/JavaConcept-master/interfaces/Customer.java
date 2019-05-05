/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Orkhan
 */
public class Customer implements IDatabase{

    @Override
    public void log() {
        System.out.println("Customer has been added...");
    }
    
}
