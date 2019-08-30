package ru.lanit.first;

public class QuantumFields extends Matter {

    private QuantumFields(){}

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

    public static QuantumFields getInstanceOf(){
        QuantumFields q = new QuantumFields();
        return q;
    }
}
