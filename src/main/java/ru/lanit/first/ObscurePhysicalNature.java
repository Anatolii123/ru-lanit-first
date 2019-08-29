package ru.lanit.first;

public class ObscurePhysicalNature extends Matter {
    @Override
    public void printClass() {
        System.out.println("Obscure Physical Nature");
    }

    @Override
    public void printAncestor() {
        System.out.println("Matter");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("DarkMatter, DarkEnergy");
    }
}
