package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Male male1 = new Male(true, "", "", null, null);
        Male male2 = new Male(true, "", "", null, null);
        Female female1 = new Female(false, "", "", null, null);
        Female female2 = new Female(false, "", "", null, null);
        System.out.println("ТЕСТ НА СОВМЕСТИМОСТЬ ДВУХ ЛЮДЕЙ");
        System.out.println("Введите данные первого человека:");
        int sex;
        do {
            System.out.print("Укажите пол:\n1 - Мужчина, 2 - Женщина: ");
            Scanner sc = new Scanner(System.in);
            sex = sc.nextInt();
            if (sex == 1) {

                System.out.print("Укажите имя:");
                male1.name = sc.next();
                System.out.print("Укажите фамилию:");
                male1.lastname = sc.next();
                System.out.print("Укажите рост:");
                male1.height = sc.nextFloat();
                System.out.print("Укажите вес:");
                male1.weight = sc.nextFloat();
                System.out.println(male1);
            } else if (sex == 2) {

                System.out.print("Укажите имя:");
                female1.name = sc.next();
                System.out.print("Укажите фамилию:");
                female1.lastname = sc.next();
                System.out.print("Укажите рост:");
                female1.height = sc.nextFloat();
                System.out.print("Укажите вес:");
                female1.weight = sc.nextFloat();
                System.out.println(female1);
            } else {
                System.out.println("Ошибка. Введите 1 или 2.");
            }
        } while (sex > 2 | sex == 0);
        System.out.println("Введите данные второго человека:");
        int sex1;
        do {
            System.out.print("Укажите пол:\n1 - Мужчина, 2 - Женщина: ");
            Scanner sc = new Scanner(System.in);
            sex1 = sc.nextInt();
            if (sex1 == 1) {
                System.out.print("Укажите имя:");
                male2.name = sc.next();
                System.out.print("Укажите фамилию:");
                male2.lastname = sc.next();
                System.out.print("Укажите рост:");
                male2.height = sc.nextFloat();
                System.out.print("Укажите вес:");
                male2.weight = sc.nextFloat();
                System.out.println(male2);
            } else if (sex1 == 2) {
                System.out.print("Укажите имя:");
                female2.name = sc.next();
                System.out.print("Укажите фамилию:");
                female2.lastname = sc.next();
                System.out.print("Укажите рост:");
                female2.height = sc.nextFloat();
                System.out.print("Укажите вес:");
                female2.weight = sc.nextFloat();
                System.out.println(female2);
            } else {
                System.out.println("Ошибка. Введите 1 или 2.");
            }
        } while (sex1 > 2 | sex1 == 0);
        if (sex == 1 & sex1 == 1) {
            System.out.println(male1.relationship(male2));
        } else if (sex == 2 & sex1 == 2) {
            System.out.println(female1.relationship(female2));
        } else if (sex == 1 & sex1 == 2) {
            System.out.println(male1.relationship(female2));
        } else if (sex == 2 & sex1 == 1) {
            System.out.println(female1.relationship(male2));
        }
    }
}