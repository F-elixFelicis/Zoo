package com.company;

public class Animal {

    private String name;
    private int age;
    private String typeAnimal;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }
}

enum Gender {
    Male("Male"), Female("Female");

    final private String typeGender;

    Gender(String typeGender) {
        this.typeGender = typeGender;
    }

    public String getTypeGender() {
        return typeGender;
    }
}

enum TypeAnimal {
    Dog("Dog"), Bird("Bird");

    final private String typeAnimal;

    TypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }
}


