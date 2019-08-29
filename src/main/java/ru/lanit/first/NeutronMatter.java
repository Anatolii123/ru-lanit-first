package ru.lanit.first;

public class NeutronMatter extends Substance {
    @Override
    public void printClass() {
        System.out.println("Neutron Matter");
    }

    @Override
    public void printAncestor() {
        System.out.println("Substance");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("No");
    }
}
