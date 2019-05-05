/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Orkhan
 */

//this is example for the understandable polymorphism
class Animal{
    private String name;
    
    //this constructor has created for the reach to Animal class
    public Animal(String name) {
        this.name = name;
    }
    
    //getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //method of Animal class
    public void speak(){
        System.out.println("Animal is speaking...");
    }
}


class Bird extends Animal{
    
    public Bird(String name) {
        //this super has created for the reach to Animal class which is the super class
        super(name);
    }

    @Override
    public void speak() {
        //if you want to override the speak() method for the Bird class which is the extent from Animal class
        System.out.println(getName() + " is singing...");
    }
}
class Cat extends Animal{
    
    public Cat(String name) {
        //this super has created for the reach to Animal class which is the super class
        super(name);
    }

    @Override
    public void speak() {
        //if you want to override the speak() method for the Cat class which is the extent from Animal class
        System.out.println(getName() + " is meowing...");
    }    
}
class Dog extends Animal{
    
    public Dog(String name) {
        //this super has created for the reach to Animal class which is the super class
        super(name);
    }

    @Override
    public void speak() {
        //if you want to override the speak() method for the Dog class which is the extent from Animal class
        System.out.println(getName() + " is barking...");
    }    
}

public class Polymorphism {
    /**
     * @param args the command line arguments
     */
    //if you call the animals one by one
    //this method is the advantage for the polymorphism
    //because if we will create new class (for example bird, cat, dog etc.)
    //we have to creat new object, new classes and etc.
    //but when we write and call this method we don't need to write these again
    public static void SpeakTry(Animal animal){
        animal.speak();
    }
    
    public static void main(String[] args){
        Animal animal= new Animal("Beast");
        Bird bird = new Bird("Chirp");
        Cat cat = new Cat("Meow");
        Dog dog = new Dog("Bark");
        
        animal.speak();
        bird.speak();
        cat.speak();
        dog.speak();
       
        //example for the reference
        //when we create the Bird object under Animal reference
        Animal animal2 = new Bird("Tweety");
        
        //when animal2 is speaking you can see it is the bird
        animal2.speak();
        //you can call the SpeakTry() for the one by one calling
        SpeakTry(new Cat("Putty"));
    }
}
