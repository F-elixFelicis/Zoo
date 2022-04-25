package com.company;

import java.util.ArrayList;

public class Zoo {

    public ArrayList<Animals> animals;
    public Dog dog;
    public Bird bird;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimals(String name, int age, String gender, Bird bird) {
        animals.add(new Bird(name, age, gender));
    }

    public void addAnimals(String name, int age, String gender, Dog dog) {
        animals.add(new Dog(name, age, gender));

    }

    public void deleteAnimals(String name) {
        animals.removeIf(e -> e.getName() == name);
    }

    public void viewAnimals() {
        System.out.println("The zoo id made up of animals:");
        for (var e : animals)
            System.out.println("The " + e.getTypeAnimals() + "'s name is " + e.getName());
        System.out.println();
    }
}