package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.carriesCargo();
        truck.hasWheels();
        System.out.println("____________________");
        Plane plane = new Plane();
        plane.hasWings();
        plane.hasWheels();
        plane.hasPropeller();
        plane.carriesCargo();
        System.out.println("____________________");
        Speedboat speedboat = new Speedboat();
        speedboat.carriesCargo();
        speedboat.hasPropeller();
        System.out.println("____________________");
        Tanker tanker = new Tanker();
        tanker.carriesCargo();
        tanker.hasPropeller();
        System.out.println("____________________");
        Taxi taxi = new Taxi();
        taxi.hasWheels();
        System.out.println("____________________");
        Helicopter helicopter = new Helicopter();
        helicopter.carriesCargo();
        helicopter.hasPropeller();
        helicopter.hasWheels();

    }
}
