package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals("Bob", 4, "Male", zoo.dog);
        zoo.addAnimals("Pipa", 9, "Male", zoo.bird);
        zoo.addAnimals("Tom", 7, "Male", zoo.dog);
        zoo.addAnimals("Felicia", 1, "Female", zoo.bird);
        zoo.viewAnimals();
        zoo.deleteAnimals("Tom");
        zoo.viewAnimals();

    }


}


