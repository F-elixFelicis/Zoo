package com.company;

public class Bird extends Animals {

    private String wingspan;
    private String сountryOfBirth;
    private final String typeAnimals = "Bird";

    public String getTypeAnimals() {
        return typeAnimals;
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

    public Bird() {
    }
    public Bird(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender((gender));
        System.out.println("Added " + typeAnimals + " named " + getName() + " age " + getAge() + " it's a " + getGender());
    }
}
