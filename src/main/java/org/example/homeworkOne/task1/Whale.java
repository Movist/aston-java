package org.example.homeworkOne.task1;

class Whale extends Mammal implements LivesInWater {
    @Override
    public void livesInWater() {
        System.out.println("Кит живет в воде");
    }

    @Override
    public void hasSpine() {
        System.out.println("Кит имеет позвоночник");
    }
}
