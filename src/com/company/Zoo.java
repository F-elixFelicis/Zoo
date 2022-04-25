package com.company;

import java.util.ArrayList;

public class Zoo {

    public ArrayList<Animal> animalArray;

    public Zoo() {
        animalArray = new ArrayList<>();
    }

    public void addAnimal(String name, int age, Gender gender, TypeAnimal typeAnimal) {
        switch (typeAnimal) {
            case Dog -> animalArray.add(new Dog(name, age, gender.getTypeGender(), typeAnimal.getTypeAnimal()));
            case Bird -> animalArray.add(new Bird(name, age, gender.getTypeGender(), typeAnimal.getTypeAnimal()));
        }
    }

    public void deleteAnimal(String name) {
        animalArray.removeIf(e -> e.getName() == name);
        System.out.println("Animal " + name + " deleted.");
    }

    public void viewAnimal() {
        System.out.println("The zoo id made up of animals:");

        for (var e : animalArray)
            System.out.println("The " + e.getTypeAnimal() + "'s name is " + e.getName());
        System.out.println();
    }
}
