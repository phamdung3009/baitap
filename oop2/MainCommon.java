package org.example.ontap.baitapvenha.day9.btvn.oop2;

public class MainCommon {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Fly fly = new Fly();
        cat.eat();
        cat.makeSound();
        cat.run();
        System.out.println("------------------------------");
        fly.eat();
        fly.makeSound();
        fly.fly();


    }
}
