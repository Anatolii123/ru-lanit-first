package ru.lanit.first;

public class BaryonicMatter extends HadronSubstance {
    @Override
    public void printClass() {
        System.out.println("Baryonic Matter");
    }

    @Override
    public void printAncestor() {
        System.out.println("Hadron substance");
        super.printAncestor();
    }

    @Override
    public void printDescendants() {
        System.out.println("Classical Substance");
    }
}
