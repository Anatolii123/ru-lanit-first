package ru.lanit.first;

public class ObscurePhysicalNature extends Matter {

    protected ObscurePhysicalNature(){}

    public void mathDescription() {
        System.out.println("It has not.");
    }

    public void force() {
        System.out.println("It has.");
    }

    public void reason() {
        System.out.println("Unknown.");
    }

    public void amountOfInformation() {
        System.out.println("A few of!");
    }

    @Override
    public void printClass() {
        System.out.println("Obscure Physical Nature");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
    }

    @Override
    public void printDescendants() {
        System.out.println("DarkMatter, DarkEnergy");
    }

    public static ObscurePhysicalNature getInstanceOf(){
        ObscurePhysicalNature o = new ObscurePhysicalNature();
        return o;
    }
}
