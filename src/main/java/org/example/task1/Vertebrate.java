package org.example.task1;

abstract class Vertebrate extends Animal implements HasSpine {
    @Override
    public void hasSpine() {
        System.out.println("Животное имеет позвоночник");
    }
}
