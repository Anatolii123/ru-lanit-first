package ru.lanit.first;

public class MagneticField extends ElectromagneticField {

    private MagneticField(){}

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

    public static MagneticField getInstanceOf(){
        MagneticField m = new MagneticField();
        return m;
    }
}
