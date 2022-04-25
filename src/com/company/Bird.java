package com.company;

public class Bird extends Animal {

    private String wingspan;
    private String сountryOfBirth;
    private String typeAnimal;
    private String gender;

    public Bird() {
    }

    public Bird(String name, int age, String gender, String typeAnimal) {
        setName(name);
        setAge(age);
        this.gender = gender;
        this.typeAnimal = typeAnimal;
        System.out.println("Added " + typeAnimal + " named " + getName() + " age " + getAge() + " it's a " + gender);
    }
    public String getWingspan() {
        return wingspan;
    }

    public String getCountryOfBirth() {
        return сountryOfBirth;
    }

    public void setBreed(String wingspan) {
        this.wingspan = wingspan;
    }

    public void setCountryOfBirth(String сountryOfBirth) {
        this.сountryOfBirth = сountryOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }


}