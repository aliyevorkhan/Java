
package oopconcept;

/**
 *
 * @author Orkhan
 */
public class bike {
    private String model;
    private int gear;
    private String brake;
    
    public bike(){
        
    //  this.model = "no info";
    //  this.gear = 0;
    //  this.brake = "no info";
        this("no info", 0, "no info");
    }
    
    //constructor
    public bike(String model, int gear, String brake){
        this.model = model;
        this.gear = gear;
        this.brake = brake;
    }
    
    //setter-getter
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return gear;
    }
    public void setBrake(String brake){
        this.brake = brake;
    }
    public String getBrake(){
        return brake;
    }
    
    //it is going to call by OOPconcept.java
    public void showInfos(){
        System.out.println("Model of bike: " + this.model);
        System.out.println("Gear count of bike: " + this.gear);
        System.out.println("Type of brake of bike: " + this.brake);        
    }
    
    
}
