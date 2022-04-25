package com.company;

public class Dog extends Animal {

    private String breed;
    private String color;
    private String typeAnimal;
    private String gender;

    public Dog() {
    }

    public Dog(String name, int age, String gender, String typeAnimal) {
        setName(name);
        setAge(age);
        this.gender = gender;
        this.typeAnimal = typeAnimal;
        System.out.println("Added " + typeAnimal + " named " + getName() + " age " + getAge() + " it's a " + gender);
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

    public String getGender() {
        return gender;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }


}
