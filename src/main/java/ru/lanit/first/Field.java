package ru.lanit.first;

public class Field extends Matter{
    protected int intensity;

    @Override
    public void printClass() {
        System.out.println("Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println(Descendants.values());
    }

    enum Descendants{
        ElectromagneticField,
        GravitationalField
    }

}
