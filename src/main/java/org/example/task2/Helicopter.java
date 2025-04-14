package org.example.task2;

public class Helicopter extends Vehicle implements HasWheels, HasPropeller, Transportable {
    @Override
    public void carriesCargo() {
        System.out.println("Вертолет возит грузы");
    }

    @Override
    public void hasPropeller() {
        System.out.println("Вертолет имеет винт");
    }

    @Override
    public void hasWheels() {
        System.out.println("Вертолет имеет колеса");
    }
}
