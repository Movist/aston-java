package org.example.task1;

class Bear extends Mammal implements HasFur {

    @Override
    public void hasFur() {
        System.out.println("Медведь имеет шерсть");
    }

    @Override
    public void hasSpine() {
        System.out.println("Медведь имеет позвоночник");
    }
}
