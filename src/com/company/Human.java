package com.company;

public abstract class Human {
    Boolean gender;
    String name, lastname;
    Float height, weight;

    public Human(Boolean gender, String name, String lastname, Float height, Float weight) {
        this.gender = gender;
        this.name = name;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Человек 1.\n Пол: " + gender + "\n Имя: " + name + "\n Фамилия: " + lastname + "\n Рост: " + height + "\n Вес:" + weight;
    }
}
