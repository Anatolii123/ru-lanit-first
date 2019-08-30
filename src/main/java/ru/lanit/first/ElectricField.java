package ru.lanit.first;

public class ElectricField extends ElectromagneticField {

    private ElectricField(){}

    @Override
    public void printClass() {
        System.out.println("Electric Field");
    }

    @Override
    public void printAncestor() {
        System.out.println("Electromagnetic Field");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }

    public static ElectricField getInstanceOf(){
        ElectricField e = new ElectricField();
        return e;
    }
}
