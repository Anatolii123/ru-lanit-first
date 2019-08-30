package ru.lanit.first;

public class QuarkGluonPlasma extends Substance {

    private QuarkGluonPlasma(){}

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

    public static QuarkGluonPlasma getInstanceOf(){
        QuarkGluonPlasma q = new QuarkGluonPlasma();
        return q;
    }
}
