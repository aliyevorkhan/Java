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
public class Manager extends Employee{
    //extra property of manager
    private int numOfEmployees;
    
    public Manager(String name, String department, int id, int salary, int numOfEmployees) {
        //call the constructor like "this" method
        super(name, department, id, salary);
        
        //extra constructor value
        this.numOfEmployees = numOfEmployees;
    }
    //extra method of manager
    public void raiseSalary(int percent){
        salary = salary +((salary*percent)/100);
        System.out.println("New salary: " + salary);
    }

    @Override
    public void showInfos() {
        //we don't write showinfos() again. We called superclass.
        super.showInfos();
        System.out.println("Number of employees: " + this.numOfEmployees);
    }

    //toString method of object class
    @Override
    public String toString() {
        return "Object of Manager";
    }
    
}
