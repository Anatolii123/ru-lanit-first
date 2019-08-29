package ru.lanit.first;

public class QuantumFields extends Matter {
    @Override
    public void printClass() {
        System.out.println("Quantum Fields");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }
}
