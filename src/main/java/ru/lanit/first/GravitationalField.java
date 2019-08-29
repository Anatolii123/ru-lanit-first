package ru.lanit.first;

public class GravitationalField extends Field {
    @Override
    public void printClass() {
        System.out.println("Gravitational Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Field");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }
}
