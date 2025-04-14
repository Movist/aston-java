package org.example.task2;

public class Truck extends Vehicle implements HasWheels, Transportable {
    @Override
    public void carriesCargo() {
        System.out.println("Грузовик возит грузы");
    }

    @Override
    public void hasWheels() {
        System.out.println("Грузовик имеет колеса");
    }
}
