package org.example.task1;

class Cat extends Mammal implements HasFur {
    @Override
    public void hasFur() {
        System.out.println("Кошка имеет шерсть");
    }

    @Override
    public void hasSpine() {
        System.out.println("Кошка имеет позвоночник");
    }
}
