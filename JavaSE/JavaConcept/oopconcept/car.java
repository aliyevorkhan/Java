
package oopconcept;

/**
 *
 * @author Orkhan
 */
public class car {
    public String model;
    private String color;
    private int doors;
    
    
    
    //setter-getter concept
    public void setDoors(int doors){
        if(doors == 2 || doors == 4){
            this.doors = doors;
        }else{
            System.out.println("The count of the doors can be only 2 or 4!");
        }
    }
    public int getDoors(){
        return this.doors;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    
}
