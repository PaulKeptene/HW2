package com.company;

import java.util.Random;

public abstract class Human<talk> {
    Boolean gender;
    String name, lastname, sex;
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
        if (gender) {
            sex = "Мужчина";
        } else {
            sex = "Женщина";
        }
        return "\nДанные о человеке:\n" + name + " " + lastname + "\nРост: " + height + " Вес:" + weight + "\nПол: " + sex + "\n";
    }

    public boolean talk(Human a) {
        if ((this.gender & !a.gender) || (!this.gender & a.gender) || (!this.gender & !a.gender)) {
            return true;
        } else {
            return new Random().nextDouble() <= 0.5;
        }
    }

    public boolean tolerate(Human a) {
        if ((this.gender & a.gender)) {
            return new Random().nextDouble() <= 0.056;
        } else if (!this.gender & !a.gender) {
            return new Random().nextDouble() <= 0.05;
        } else {
            return new Random().nextDouble() <= 0.7;
        }
    }

    public boolean timetogether(Human a) {
        if (this.height > a.height) {
            if (((this.height / a.height - 1) * 100) > 10) {
                return new Random().nextDouble() <= 0.85;
            } else {
                return new Random().nextDouble() <= 0.95;
            }
        } else {
            if (((a.height / this.height - 1) * 100) > 10) {
                return new Random().nextDouble() <= 0.85;
            } else {
                return new Random().nextDouble() <= 0.95;
            }
        }
    }

    public Human relationship(Human a) {
        if (this.talk(a) & this.tolerate(a) & this.timetogether(a)) {
            if (this.gender == a.gender) {
                System.out.println("Ничего не вышло, разбежались");
                return null;
            } else {
                if (this.gender) {
                    Female b = (Female) a;
                    return b.givebirth(this);
                } else {
                    Female b = (Female) this;
                    return b.givebirth(a);
                }
            }
        }
        System.out.println("Ничего не вышло, разбежались");
        return null;
    }
}
