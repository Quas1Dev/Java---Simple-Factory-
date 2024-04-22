package com.mycompany.simplefactory;

public class AnimalFactory {
    public enum Type {Dog, Tiger}
    public Animal createAnimal(Type animal) {
        
        switch (animal) {
            case Dog -> {
                return new Dog();
            }
            case Tiger -> {
                return new Tiger();
            }
            default -> {
                System.out.println("You can create either a "
                        + "'dog' or a tiger.");
                throw new IllegalArgumentException("Unknown animal "
                        + "cannot be instantiated");
            }
        }
    }
}
