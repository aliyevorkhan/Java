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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //we cannot create object with interfaces!!!
        //IDatabase datadabase = new IDatabase();
     
        Student student = new Student();
        Customer customer = new Customer();
        
        student.log();
        customer.log();
        
        IDatabase database1 = new Student();
        IDatabase database2 = new Customer();
        
        database1.log();
        database2.log();
    }
    
}
