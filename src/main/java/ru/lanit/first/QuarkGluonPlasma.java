package ru.lanit.first;

public class QuarkGluonPlasma extends Substance {
    @Override
    public void printClass() {
        System.out.println("Quark-Gluon Plasma");
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
