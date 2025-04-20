package org.example.homeworkOne.task1;

class Fish extends Vertebrate implements LivesInWater {

    @Override
    public void livesInWater() {
        System.out.println("Рыба живет в воде");
    }

    @Override
    public void hasSpine() {
        System.out.println("Рыба имеет позвоночник");
    }
}
