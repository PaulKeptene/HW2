package com.company;

import java.util.Random;
import java.util.Scanner;

public class Female extends Human {
    public Female(Boolean gender, String name, String lastname, Float height, Float weight) {
        super(false, name, lastname, height, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean talk(Human a) {
        return super.talk(a);
    }

    @Override
    public boolean tolerate(Human a) {
        return super.tolerate(a);
    }

    @Override
    public boolean timetogether(Human a) {
        return super.timetogether(a);
    }

    @Override
    public Human relationship(Human a) {
        return super.relationship(a);
    }

    public Human givebirth(Human a) {
        Male boy = new Male(true,"", "", null,  null);
        Female girl = new Female(false,"", "", null,  null);
        Scanner sc = new Scanner(System.in);
        System.out.println("У вас родился ребенок!");
        System.out.print("Назовите своего ребенка:");
        if (new Random().nextDouble() <= 0.5) {
            boy.name = sc.next();
            if (this.gender) {
                boy.lastname = this.lastname;
                boy.height = this.height + 0.1f * (a.height - this.height);
                boy.weight = this.weight + 0.1f * (a.weight - this.weight);
            } else {
                boy.lastname = a.lastname;
                boy.height = a.height + 0.1f * (this.height - a.height);
                boy.weight = a.weight + 0.1f * (this.weight - a.weight);
            }
            return boy;
        } else {
            girl.name = sc.next();
            if (this.gender) {
                girl.lastname = this.lastname;
                girl.height = this.height + 0.1f * (a.height - this.height);
                girl.weight = this.weight + 0.1f * (a.weight - this.weight);
            } else {
                girl.lastname = a.lastname;
                girl.height = a.height + 0.1f * (this.height - a.height);
                girl.weight = a.weight + 0.1f * (this.weight - a.weight);
            }
            return girl;
        }
    }
}

