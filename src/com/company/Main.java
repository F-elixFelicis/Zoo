package com.company;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal("Bob", 4, Gender.Male, TypeAnimal.Dog);
        zoo.addAnimal("Pippa", 9, Gender.Male, TypeAnimal.Bird);
        zoo.addAnimal("Tom", 7, Gender.Male, TypeAnimal.Dog);
        zoo.addAnimal("Felicia", 1, Gender.Male, TypeAnimal.Bird);
        zoo.viewAnimal();
        zoo.deleteAnimal("Tom");
        zoo.viewAnimal();

    }


}


