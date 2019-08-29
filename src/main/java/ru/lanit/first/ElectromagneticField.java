package ru.lanit.first;

public class ElectromagneticField extends Field {
    @Override
    public void printClass() {
        System.out.println("Electromagnetic Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Field");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("ElectricField, MagneticField");
    }
}
