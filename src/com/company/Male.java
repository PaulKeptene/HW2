package com.company;

public class Male extends Human {
    public Male(Boolean gender, String name, String lastname, Float height, Float weight) {
        super(true, name, lastname, height, weight);
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
}
