package com.mycompany.simplefactory;

public class SimpleFactory {
    public static void main(String[] args) {
        System.out.println("*** A demo of Simple Factory method! ***");
        
        AnimalFactory factory = new AnimalFactory();
        
        Animal animal = factory.createAnimal(AnimalFactory.Type.Dog);
        animal.displayBehavior();
        
        animal = factory.createAnimal(AnimalFactory.Type.Tiger);
        animal.displayBehavior();
    }
}
