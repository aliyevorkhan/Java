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
public class Employee {
    private String name;
    private String department;
    private int id;
    int salary;

    public Employee(String name, String department, int id, int salary) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.salary = salary;
    }
    public void showInfos(){
        System.out.println("Informations:");
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
