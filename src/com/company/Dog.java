package com.company;

public class Dog extends Animals {

    private String breed;
    private String color;
    private final String typeAnimals = "Dog";

    public String getTypeAnimals() {
        return typeAnimals;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {
    }

    public Dog(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender((gender));
        System.out.println("Added " + typeAnimals + " named " + getName() + " age " + getAge() + " it's a " + getGender());
    }
}
