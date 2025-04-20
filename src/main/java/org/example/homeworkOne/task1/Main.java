package org.example.homeworkOne.task1;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.hasSpine();
        fish.livesInWater();
        System.out.println("____________________");
        Bear bear = new Bear();
        bear.hasSpine();
        bear.hasFur();
        System.out.println("____________________");
        Cat cat = new Cat();
        cat.hasSpine();
        cat.hasFur();
        System.out.println("____________________");
        Whale whale = new Whale();
        whale.hasSpine();
        whale.livesInWater();
        System.out.println("____________________");

    }
}
