package org.example.homeworkOne.task2;

public class Taxi extends Vehicle implements HasWheels {
    @Override
    public void hasWheels() {
        System.out.println("Такси имеет колеса");
    }
}
