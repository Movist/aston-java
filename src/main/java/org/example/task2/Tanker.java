package org.example.task2;

public class Tanker extends Vehicle implements HasPropeller, Transportable {
    @Override
    public void carriesCargo() {
        System.out.println("Танкер возит грузы");
    }

    @Override
    public void hasPropeller() {
        System.out.println("Танкер имеет винт");
    }
}
