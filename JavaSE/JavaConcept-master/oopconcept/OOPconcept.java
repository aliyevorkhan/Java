
package oopconcept;

/**
 *
 * @author Orkhan
 */
public class OOPconcept {

    public static void main(String[] args) {
        //we created bike with constructor
        bike bike1 = new bike("Mountain", 7, "Hands");
        //if you want to call this object it is going to overload and coming default values
        bike bike2 = new bike();
        //we created new object of car 
        car car1 = new car();
        
        //call the showInfos method which is made with constructor
        bike1.showInfos();
        bike2.showInfos();
        //public call
        car1.model = "BMW";
        
        //private call
        car1.setColor("Black");
        car1.setDoors(2);
        
        //public output
        System.out.println("Model of car1: " + car1.model);
        
        //private output
        System.out.println("Color of car1: " + car1.getColor());
        System.out.println("Count of the doors: " + car1.getDoors());
    }
    
}
