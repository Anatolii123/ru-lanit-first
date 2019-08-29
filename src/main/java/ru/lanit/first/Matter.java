package ru.lanit.first;


public class Matter {
    private String Science;
    private boolean MathDescription;

    public void printClass() {
        System.out.println("Matter");
    }
    public void printAncestor() {
        System.out.println("Object");
    }
    public void printDescendants() {
        System.out.println("Substance, Field, QuantumFields, ObscurePhysicalNature");
    }
}
