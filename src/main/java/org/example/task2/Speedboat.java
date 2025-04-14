package org.example.task2;

public class Speedboat extends Vehicle implements HasPropeller, Transportable {
    @Override
    public void carriesCargo() {
        System.out.println("Катер возит грузы");
    }

    @Override
    public void hasPropeller() {
        System.out.println("Катер имеет винт");
    }
}
