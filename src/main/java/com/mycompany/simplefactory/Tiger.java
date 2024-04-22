package com.mycompany.simplefactory;

public class Tiger implements Animal {

    public Tiger() {
        System.out.println("A tiger is created!");
    }
    
    @Override
    public void displayBehavior(){
        System.out.println("Tiger says: Halum.");
        System.out.println("It likes to roam in a jungle.");
        System.out.println("\n*******\n");
    }
}
