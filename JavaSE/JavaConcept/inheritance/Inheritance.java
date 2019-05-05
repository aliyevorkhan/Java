/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Orkhan
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //we created new object which is employee it's super class
        Employee employee = new Employee("David Johnson", "Java developer", 012, 1000);
        
        //run the consturctor's method
        employee.showInfos();
        
        //we created new object which is manager it's subclass of employee
        Manager manager = new Manager("Fernand Matt", "Manager", 013, 2000, 10);
        
        //run the constuctor's method
        manager.showInfos();
        
        //how much do you want to raise?
        manager.raiseSalary(10);
	
	
	//if we create new object from Employee and that's name is manager
	Employee employee = new Manager("Dave McKean", "Manager", 014, 2000, 10); //this is the polymorphism
	//if we call the showInfos() method, actually we call the subclass of employee
	employee.showInfos(); //run the manager informations 
        
        //object class
        System.out.println(manager);
    }
    
}
