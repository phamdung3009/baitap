package org.example.ontap.baitapvenha.day9.btvn.oop2;

public class Cat extends Animal {
    //@Override ghi đè phương thức của lớp cha Animal
    @Override
    public void eat() {
        System.out.println("meo mumum...");
    }

    @Override
    public void makeSound() {
        System.out.println("meo make sound : miumiu....");
    }

    public void run() {
        System.out.println("cat run");
    }
}
