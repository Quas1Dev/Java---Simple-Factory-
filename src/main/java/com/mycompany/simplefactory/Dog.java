package com.mycompany.simplefactory;

public class Dog implements Animal {

    public Dog() {
        System.out.println("A dog is created!");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It says: Bow-wow");
        System.out.println("It preffers barking!");
        System.out.println("\n*******\n");
    }
    
}
