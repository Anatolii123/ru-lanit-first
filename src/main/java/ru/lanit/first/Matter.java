package ru.lanit.first;


public class Matter {
    protected String science;
    protected boolean mathDescription;

    public void printClass() {
        System.out.println("Matter");
    }
    public void printAncestor() {
        System.out.println("Object");
    }
    public void printDescendants() {
        System.out.println(Descendants.values());
    }
    enum Descendants{
        Substance,
        Field,
        QuantumFields,
        ObscurePhysicalNature
    }
}

