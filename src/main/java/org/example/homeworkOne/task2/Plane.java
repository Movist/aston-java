package org.example.homeworkOne.task2;

public class Plane extends Vehicle implements HasWheels, HasPropeller, HasWings, Transportable {
    @Override
    public void carriesCargo() {
        System.out.println("Самолет возит грузы");
    }

    @Override
    public void hasPropeller() {
        System.out.println("Самолет имеет винт");
    }

    @Override
    public void hasWheels() {
        System.out.println("Самолет имеет колеса");
    }

    @Override
    public void hasWings() {
        System.out.println("Самолет имеет крылья");
    }
}
