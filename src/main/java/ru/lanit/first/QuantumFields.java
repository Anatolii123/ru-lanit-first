package ru.lanit.first;

public class QuantumFields extends Matter {

    protected QuantumFields(){}

    public void mathDescription() {
        System.out.println("It has.");
    }

    public void force() {
        System.out.println("It has.");
    }

    public void reason() {
        System.out.println("Unknown.");
    }

    public void amountOfInformation() {
        System.out.println("A lot of!");
    }

    @Override
    public void printClass() {
        System.out.println("Quantum Fields");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static QuantumFields getInstanceOf(){
        QuantumFields q = new QuantumFields();
        return q;
    }

    public void printSentence(){
        System.out.println("This is a Quantum Field.");
    }
}
