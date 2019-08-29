package ru.lanit.first;

public class DarkEnergy extends ObscurePhysicalNature {
    @Override
    public void printClass() {
        System.out.println("Dark Energy");
    }

    @Override
    public void printAncestor() {
        System.out.println("Obscure Physical Nature");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }
}
