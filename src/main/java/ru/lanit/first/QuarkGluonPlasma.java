package ru.lanit.first;

public class QuarkGluonPlasma extends Substance {

    private QuarkGluonPlasma(){}

    public boolean equals(Object o) {
        if(o instanceof QuarkGluonPlasma){
            return super.equals(o);
        }
        return false;
    }

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
